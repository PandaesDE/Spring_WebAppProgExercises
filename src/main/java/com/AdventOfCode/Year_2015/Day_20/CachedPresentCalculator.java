package com.AdventOfCode.Year_2015.Day_20;


import java.util.HashMap;

public class CachedPresentCalculator {
    private final HashMap<Integer, CachedPresent> cache;
    private int totalPresents = 0;
    private int lowestHouseNumber = 0;
    private static int MAX_VISITED_HOUSES_PER_ELF = 0;


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
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 7) incrementer = 2;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 42) incrementer = 4;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 60) incrementer = 6;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 600) incrementer = 12;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 868) incrementer = 24;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 1560) incrementer = 30;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 2016) incrementer = 36;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 3224) incrementer = 60;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 22568) incrementer = 72;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 43200) incrementer = 144;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 187200) incrementer = 420;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 292608) incrementer = 1080;
        if (minPresentsAmount / CachedPresent.getPresentMultiplier() > 369024) incrementer = 1800;

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
        for (int house = lowestHouseNumber / 2; house >= 1 ; house--)
        {
            if (lowestHouseNumber / house > MAX_VISITED_HOUSES_PER_ELF)
                break;

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

    public static void setMaxVisitedHousesPerElf(int maxVisitedHousesPerElf)
    {
        MAX_VISITED_HOUSES_PER_ELF = maxVisitedHousesPerElf;
    }
}
