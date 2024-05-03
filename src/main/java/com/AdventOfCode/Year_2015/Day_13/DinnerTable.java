package com.AdventOfCode.Year_2015.Day_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DinnerTable {
    private List<Knight> allKnights = new ArrayList<>();
    private int bestScore = Integer.MIN_VALUE;

    public void initializeKnight(String knightName1, String knightName2, int sympathy)
    {
        Knight knight1 = new Knight(knightName1);
        if (allKnights.contains(knight1))
        {
            int index = allKnights.indexOf(knight1);
            allKnights.get(index).addKnight(new Knight(knightName2), sympathy);
        }
        else
        {
            knight1.addKnight(new Knight(knightName2), sympathy);
            allKnights.add(knight1);
        }
    }

    public void doConfiguration()
    {
        int size = allKnights.size();
        for (int index = 0; index < size; index++)
        {
            Knight k = allKnights.get(index);

            if (index == 0) k.setLeftNeighbor(allKnights.get(size - 1));
            else k.setLeftNeighbor(allKnights.get(index - 1));

            if (index == size - 1) k.setRightNeighborNeighbor(allKnights.get(0));
            else k.setRightNeighborNeighbor(allKnights.get(index + 1));
        }
    }

    public void optimizeConfiguration()
    {
        int score = 0;

        for (Knight k : allKnights)
        {
            score += k.getHappynessScore();
        }

        if (score > bestScore) this.bestScore = score;

        //Collections.swap(allKnights, 0, 7);
    }


    public int getScore()
    {
        return this.bestScore;
    }
}
