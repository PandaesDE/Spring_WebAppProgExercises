package com.AdventOfCode.Year_2015.Day_20;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

public class Infinite_Elves_and_Infinite_Houses extends AOCExercise {

    private CachedPresentCalculator calculator;

    @Override
    public String answer1() {
        init(10, Integer.MAX_VALUE);
        int minPresents = Conveniencer.stringToInt(this.input);
        return "" + calculator.getLowestHouseNumber(minPresents);
    }

    @Override
    public String answer2() {
        init(11, 50);
        int minPresents = Conveniencer.stringToInt(this.input);
        return "" + calculator.getLowestHouseNumber(minPresents);
    }

    private void init(int presentMultiplier, int maxVisitedHousesPerElf)
    {
        this.calculator = new CachedPresentCalculator(presentMultiplier, maxVisitedHousesPerElf);
    }
}
