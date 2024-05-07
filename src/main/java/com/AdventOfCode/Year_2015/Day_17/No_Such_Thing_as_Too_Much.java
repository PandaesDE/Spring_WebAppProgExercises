package com.AdventOfCode.Year_2015.Day_17;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class No_Such_Thing_as_Too_Much extends AOCExercise {
    private List<Integer> containerSizes;
    private Map<Integer,Integer> combinationsPerContainerAmount;
    private int maxSize;
    private int combinationAmount;
    @Override
    public String answer1() {
        init();
        calculateAllCombinations(containerSizes, 0);
        return "" + combinationAmount;
    }

    @Override
    public String answer2() {
        init();
        calculateAllMinmalContainerCombinations(containerSizes, 0, 0);
        return "" + combinationsPerContainerAmount.values().iterator().next();
    }

    private void calculateAllMinmalContainerCombinations(List<Integer> containers, int sum, int depth)
    {
        if (sum > maxSize) return;
        if (sum == maxSize)
        {
            if (combinationsPerContainerAmount.containsKey(depth + 1))
            {
                //increment value
                combinationsPerContainerAmount.merge(depth + 1, 1, Integer::sum);
            } else
            {
                //initialize value
                combinationsPerContainerAmount.put(depth + 1, 1);
            }
            return;
        }

        for (int index = 0; index < containers.size(); index++)
        {
            List<Integer> remainingContainers = new ArrayList<>(containers);

            for (int index2 = 0; index2 < index; index2++)
            {
                remainingContainers.remove(0);
            }

            Integer value = remainingContainers.remove(0);

            calculateAllMinmalContainerCombinations(remainingContainers, sum + value, depth + 1);
        }
    }

    private void calculateAllCombinations(List<Integer> containers, int sum)
    {
        if (sum > maxSize) return;
        if (sum == maxSize)
        {
            combinationAmount++;
            return;
        }

        for (int index = 0; index < containers.size(); index++)
        {
            List<Integer> remainingContainers = new ArrayList<>(containers);

            for (int index2 = 0; index2 < index; index2++)
            {
                remainingContainers.remove(0);
            }

            Integer value = remainingContainers.remove(0);

            calculateAllCombinations(remainingContainers, sum + value);
        }
    }

    private void init()
    {
        containerSizes = new ArrayList<>();
        combinationsPerContainerAmount = new HashMap<>();
        maxSize = Conveniencer.stringToInt(this.args[0]);
        combinationAmount = 0;

        Conveniencer.convertTextToLines(this.input).forEach(line -> {
            int size = Conveniencer.stringToInt(line);
            containerSizes.add(size);
        });
    }
}
