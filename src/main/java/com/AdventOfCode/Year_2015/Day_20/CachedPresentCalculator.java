package com.AdventOfCode.Year_2015.Day_20;


import java.util.HashMap;

public class CachedPresentCalculator {
    private final HashMap<Integer, CachedPresent> cache;
    private int totalPresents = 0;
    private int lowestHouseNumber = 0;

    public CachedPresentCalculator()
    {
        cache = new HashMap<>();
    }

    public int getLowestHouseNumber(int minPresentsAmount)
    {
        /*  TODO: This Code is very slow
        * */

        /* optimization block */
        int incrementer = 1;
        if (minPresentsAmount > 7 * CachedPresent.getPresentMultiplier()) incrementer = 2;
        if (minPresentsAmount > 42 * CachedPresent.getPresentMultiplier()) incrementer = 4;
        if (minPresentsAmount > 600 * CachedPresent.getPresentMultiplier()) incrementer = 6;

        while (totalPresents < minPresentsAmount)
        {
            totalPresents = 0;
            lowestHouseNumber += incrementer;

            calculateAllTotalPresents();
        }

        return lowestHouseNumber;
    }

    private void calculateAllTotalPresents()
    {
        /*
        * */
        for (int house = lowestHouseNumber / 2; house >= 1 ; house--)
        {
            if (lowestHouseNumber % house != 0)
                continue;

            calculateTotalPresents(house);
        }

        calculateTotalPresents(lowestHouseNumber);
    }

    private void calculateTotalPresents(int houseNumber)
    {
        if (!cache.containsKey(houseNumber))
            cache.put(houseNumber, new CachedPresent(houseNumber));

        totalPresents += cache.get(houseNumber).getPresents(houseNumber);
    }

}
