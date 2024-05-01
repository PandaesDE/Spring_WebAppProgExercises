package com.AdventOfCode.Year_2015.Day_12;

import com.AdventOfCode.AOCExercise;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Iterator;
import java.util.Map;

public class JSAbacusFrameworkIO extends AOCExercise {
    //https://www.baeldung.com/jsonobject-iteration
    @Override
    public String answer1() {
        return "" + getSumOfAllNumbersInJSON(null);
    }

    @Override
    public String answer2() {
        return "" + getSumOfAllNumbersInJSON("red");
    }


    private int getSumOfAllNumbersInJSON(String ignoreInObject) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = null;

        try {
            rootNode = mapper.readValue(this.input, JsonNode.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return processNode(rootNode, ignoreInObject);
    }

    private int processNode(JsonNode node, String ignoreInObject)
    {
        int sum = 0;
        if (node.isArray())
        {
            for (JsonNode element : node) {
                sum += processNode(element, ignoreInObject); // No key for array elements
            }
        } else if (node.isObject())
        {
            if (ignoreInObject != null)
                for (Iterator<Map.Entry<String, JsonNode>> it = node.fields(); it.hasNext();) {
                    Map.Entry<String, JsonNode> entry = it.next();
                    if (entry.getValue().isValueNode() && entry.getValue().asText().equals(ignoreInObject))
                    {
                        return 0;
                    }
                }


            for (Iterator<Map.Entry<String, JsonNode>> it = node.fields(); it.hasNext();) {
                Map.Entry<String, JsonNode> entry = it.next();
                JsonNode valueNode = entry.getValue();
                // Handle key and value based on their types
                sum += processNode(valueNode, ignoreInObject);
            }
        } else if (node.isValueNode())
        {
            if (node.isNumber())
            {
                sum += node.asInt();
            }
        }

        return sum;
    }
}
