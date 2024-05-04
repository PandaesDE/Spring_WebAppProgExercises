package com.AdventOfCode.Year_2015.Day_13;

import java.util.HashMap;

public class Knight {
    private final String name;
    private Knight leftNeighbor;
    private Knight rightNeighbor;
    private final HashMap<Knight, Integer> sympathyMap;

    public Knight(String name)
    {
        this.name = name;
        sympathyMap = new HashMap<>();
    }

    public Knight(Knight knight)
    {
        this.name = knight.name;
        this.leftNeighbor = knight.leftNeighbor;
        this.rightNeighbor = knight.rightNeighbor;
        this.sympathyMap = knight.sympathyMap;
    }

    public void addKnight(Knight k, int sympathy)
    {
        sympathyMap.put(k, sympathy);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Knight k = (Knight) obj;
        return this.name.equals(k.getName());
    }

    @Override
    public int hashCode()
    {
        return this.name.hashCode();
    }

    @Override
    public Object clone()
    {
        try
        {
            return (Knight) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Knight(this);
        }
    }

    public String getName()
    {
        return this.name;
    }

    public int getHappinessScore()
    {
        int l = sympathyMap.get(leftNeighbor);
        int r = sympathyMap.get(rightNeighbor);

        return l + r;
    }

    public void setLeftNeighbor(Knight l)
    {
        this.leftNeighbor = l;
    }

    public void setRightNeighborNeighbor(Knight r)
    {
        this.rightNeighbor = r;
    }
}
