package com.AdventOfCode.Year_2015.Day_19;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.*;

public class Medicine_for_Rudolph extends AOCExercise {

    private Map<String, Set<String>> replacements;
    private Set<String> combinations;

    private int minReplacements;

    @Override
    public String answer1() {
        initArgs(false);
        initCombinations();
        return "" + combinations.size();
    }

    @Override
    public String answer2() {
        initArgs(true);
        sortReplacements();
        minReplacements = Integer.MAX_VALUE;
        getMedicineCreationCount(this.input, 0);
        return "" + minReplacements;
    }

    private void sortReplacements()
    {
        Map<String, Set<String>> sortedMap = new TreeMap<>((key1, key2) -> {
            int lengthComparison = key2.length() - key1.length();
            if (lengthComparison != 0) {
                return lengthComparison;
            } else {
                // If lengths are equal, sort lexicographically (default behavior)
                return key1.compareTo(key2);
            }
        });

        sortedMap.putAll(replacements);

        replacements = sortedMap;
    }

    private int getMedicineCreationCount(String input, int depth)
    {
        if (minReplacements <= depth) return minReplacements;
        if (input.equals(args[1]))
        {
            minReplacements = depth;
            return minReplacements;
        }

        for (String target : replacements.keySet())
        {
            if (!input.contains(target)) continue;

            for (String replacement : replacements.get(target))
            {
                int minDepth = getMedicineCreationCount(input.replaceFirst(target, replacement), depth + 1);

                if (minDepth < Integer.MAX_VALUE) return minDepth;
            }
        }

        return Integer.MAX_VALUE;
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

    private void initArgs(boolean reversed)
    {
        replacements = new HashMap<>();

        Conveniencer.convertTextToLines(this.args[0]).forEach(line -> {
            String[] tokenizedLine = line.split(" ");
            String molecule = tokenizedLine[0];
            String replacement = tokenizedLine[2];

            if (reversed)
            {
                molecule = tokenizedLine[2];
                replacement = tokenizedLine[0];
            }

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
