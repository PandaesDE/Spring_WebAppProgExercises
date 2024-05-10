package com.AdventOfCode.Year_2015.Day_19;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Medicine_for_Rudolph extends AOCExercise {

    private Map<String, Set<String>> replacements;
    private Set<String> combinations;

    @Override
    public String answer1() {
        initArgs();
        initCombinations();
        return "" + combinations.size();
    }

    @Override
    public String answer2() {
        initArgs();

        return null;
    }

    private void initCombinations()
    {
        combinations = new HashSet<>();

        for (String target : replacements.keySet())
        {
            for (String replacement : replacements.get(target))
            {
                doOneStepReplacement(target, replacement);
            }
        }
    }

    private void doOneStepReplacement(String target, String replacement)
    {
        String combination;
        int index = this.input.indexOf(target);

        while (index >= 0)
        {
            combination = replace(this.input, target, replacement, index);
            combinations.add(combination);

            index = this.input.indexOf(target, index + 1);
        }
    }

    private String replace(String origin, String target, String replace, int index)
    {
        return origin.substring(0, index) + origin.substring(index).replaceFirst(target, replace);
    }

    private void initArgs()
    {
        replacements = new HashMap<>();

        Conveniencer.convertTextToLines(this.args[0]).forEach(line -> {
            String[] tokenizedLine = line.split(" ");
            String molecule = tokenizedLine[0];
            String replacement = tokenizedLine[2];

            if (replacements.containsKey(molecule))
            {
                replacements.get(molecule).add(replacement);
            }
            else
            {
                Set<String> firstItemSet = new HashSet<>();
                firstItemSet.add(replacement);
                replacements.put(molecule, firstItemSet);
            }
        });
    }
}
