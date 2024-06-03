package com.AdventOfCode.Year_2015.Day_23;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.HashMap;
import java.util.List;

public class Opening_the_Turing_Lock extends AOCExercise {
    private HashMap<String, Integer> registries;
    @Override
    public String answer1() {
        registries = new HashMap<>();
        registries.put("a", 0);
        registries.put("b", 0);
        executeInput();
        return "" + registries.get("b");
    }

    @Override
    public String answer2() {
        registries = new HashMap<>();
        registries.put("a", 1);
        registries.put("b", 0);
        executeInput();
        return "" + registries.get("b");
    }

    private void executeInput()
    {
        String input = this.input.replaceAll(",","");
        List<String> lines = Conveniencer.convertTextToLines(input);

        int index = 0;
        while (index < lines.size())
        {
            String[] splitLine = lines.get(index).split(" ");
            String instruction = splitLine[0];

            if (instruction.equals("hlf"))
            {
                registries.put(splitLine[1], registries.get(splitLine[1]) / 2);
                index++;
                continue;
            }
            if (instruction.equals("tpl"))
            {
                registries.put(splitLine[1], registries.get(splitLine[1]) * 3);
                index++;
                continue;
            }
            if (instruction.equals("inc"))
            {
                registries.put(splitLine[1], registries.get(splitLine[1]) + 1);
                index++;
                continue;
            }
            if (instruction.equals("jmp"))
            {
                index += Conveniencer.stringToInt(splitLine[1]);
                continue;
            }
            if (instruction.equals("jie"))
            {
                if (registries.get(splitLine[1]) % 2 == 0)
                    index += Conveniencer.stringToInt(splitLine[2]);
                else
                    index++;
                continue;
            }
            if (instruction.equals("jio"))
            {
                if (registries.get(splitLine[1]) == 1)
                    index += Conveniencer.stringToInt(splitLine[2]);
                else
                    index++;
            }
        }
    }
}
