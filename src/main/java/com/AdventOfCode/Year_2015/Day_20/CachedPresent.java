package com.AdventOfCode.Year_2015.Day_20;

public class CachedPresent {
    private int elfNumber = 0;
    private int totalHouseVisitations = 0;
    private int presents = 0;

    public CachedPresent(int elfNumber)
    {
        this.elfNumber = elfNumber;
    }

    public int getPresents(int houseNumber, int multiplier)
    {
        int houseVisitations = houseNumber / this.elfNumber;
        if (houseVisitations == this.totalHouseVisitations) return this.presents;

        if (houseVisitations > this.totalHouseVisitations)
        {
            int housesToVisit = houseVisitations - this.totalHouseVisitations;

            for (int index = 0; index < housesToVisit; index++)
            {
                this.presents += (houseVisitations - index) * multiplier * this.elfNumber;
                this.totalHouseVisitations += 1;
            }
        }
        else
        {
            int housesToUnvisit = this.totalHouseVisitations - houseVisitations;

            for (int index = 0; index < housesToUnvisit; index++)
            {
                this.presents -= (houseVisitations - index) * multiplier;
                this.totalHouseVisitations -= 1;
            }
        }

        return this.presents;
    }
}
