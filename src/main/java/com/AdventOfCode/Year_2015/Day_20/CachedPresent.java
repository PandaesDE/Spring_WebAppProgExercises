package com.AdventOfCode.Year_2015.Day_20;

public class CachedPresent {
    private int elfNumber = 0;
    private int totalHouseVisitations = 0;
    private int presents = 0;

    private static int PRESENT_MULTIPLIER = 0;

    private static int MAX_VISITED_HOUSES_PER_ELF = 0;

    public CachedPresent(int elfNumber)
    {
        this.elfNumber = elfNumber;
    }

    public int getPresents(int houseNumber)
    {
        int houseVisitations = houseNumber / this.elfNumber;

        if (houseVisitations > MAX_VISITED_HOUSES_PER_ELF) return 0;
        if (houseVisitations == this.totalHouseVisitations) return this.presents;

        int houseDifference = houseVisitations - this.totalHouseVisitations;
        int houseDifferencePositive = Math.abs(houseDifference);
        int visit = houseDifference > 0 ? 1 : -1;

        for (int index = 0; index < houseDifferencePositive; index++)
        {
            this.presents += (houseVisitations - index) * PRESENT_MULTIPLIER * this.elfNumber;
            this.totalHouseVisitations += visit;
        }

        return this.presents;
    }

    public static int getPresentMultiplier() {
        return PRESENT_MULTIPLIER;
    }

    public static void setPresentMultiplier(int presentMultiplier)
    {
        PRESENT_MULTIPLIER = presentMultiplier;
    }

    public static void setMaxVisitedHousesPerElf(int maxVisitedHousesPerElf)
    {
        MAX_VISITED_HOUSES_PER_ELF = maxVisitedHousesPerElf;
    }
}
