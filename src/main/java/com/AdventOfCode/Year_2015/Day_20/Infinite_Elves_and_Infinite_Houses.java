package com.AdventOfCode.Year_2015.Day_20;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.HashMap;
import java.util.TreeMap;

public class Infinite_Elves_and_Infinite_Houses extends AOCExercise {

    private CachedPresentCalculator calculator;

    @Override
    public String answer1() {
        init(Integer.MAX_VALUE, 10);

        int minPresents = Conveniencer.stringToInt(this.input);
        return "" + calculator.getLowestHouseNumber(minPresents);
    }

    @Override
    public String answer2() {
        init(50, 11);

        int minPresents = Conveniencer.stringToInt(this.input);
        return "" + calculator.getLowestHouseNumber(minPresents);
    }

    private void init(int maxVisitedHousesPerElf, int presentMultiplier)
    {
        CachedPresentCalculator.setMaxVisitedHousesPerElf(maxVisitedHousesPerElf);
        CachedPresent.setPresentMultiplier(presentMultiplier);
        this.calculator = new CachedPresentCalculator();
    }

    //TODO: if optimize in future, this is helpful
    private void test()
    {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int steps = 100000;
        int max = 0;
        int sum = 0;
        int increment = 1;
        int oldI = 1;

        for (int i = 1; i < steps; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0) sum += j;
            }

            if (sum > max)
            {
                increment = i - oldI;
                oldI = i;
                max = sum;

                map.put(increment, max);
            }

            sum = 0;
        }

        map.forEach((k,v) -> {
            System.out.println(0 + ") Max: " + v + " | Increment: " + k);
        });
    }
}
