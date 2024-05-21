package com.AdventOfCode.Year_2015.Day_20;


import java.util.HashMap;

public class CachedPresentCalculator {
    private final int presentMultiplier;
    private final int maxVisitedHousesPerElf;
    private final HashMap<Integer, CachedPresent> cache;
    private int totalPresents = 0;
    private int lowestHouseNumber = 0;

    public CachedPresentCalculator(int presentMultiplier, int maxVisitedHousesPerElf)
    {
        this.presentMultiplier = presentMultiplier;
        this.maxVisitedHousesPerElf = maxVisitedHousesPerElf;
        cache = new HashMap<>();
    }

    public int getLowestHouseNumber(int minPresentsAmount)
    {
        /*  TODO: This Code is very slow
        * */
        while (totalPresents < minPresentsAmount)
        {
            totalPresents = 0;
            lowestHouseNumber++;

            for (int house = 1; house <= lowestHouseNumber / 2; house++)
            {
                if (lowestHouseNumber % house != 0)
                    continue;

                calculateTotalPresents(house);
                if (totalPresents >= minPresentsAmount) break;
            }

            calculateTotalPresents(lowestHouseNumber);
        }

        return lowestHouseNumber;
    }

    private void calculateTotalPresents(int houseNumber)
    {
        if (!cache.containsKey(houseNumber))
            cache.put(houseNumber, new CachedPresent(houseNumber, this.maxVisitedHousesPerElf));

        totalPresents += cache.get(houseNumber).getPresents(houseNumber, presentMultiplier);
    }

}
