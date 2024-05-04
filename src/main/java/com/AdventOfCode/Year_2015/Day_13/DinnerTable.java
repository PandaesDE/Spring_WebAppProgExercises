package com.AdventOfCode.Year_2015.Day_13;

import com.AdventOfCode.Conveniencer;

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
            setNeighbors(allKnights, index);
        }
    }

    public void optimizeConfiguration()
    {
        Conveniencer.Permutations.of(allKnights).forEach(permutation ->
        {
            List<Knight> sittingConfiguration = permutation.toList();
            setAllNeighbors(sittingConfiguration);
            int score = calculateScore(sittingConfiguration);

            if (score > this.bestScore)
            {
                this.bestScore = score;
                allKnights = sittingConfiguration;
            }
        });
    }

    private void setAllNeighbors(List<Knight> knights)
    {
        for (int i = 0; i < knights.size(); i++)
        {
            setNeighbors(knights, i);
        }
    }

    private void setNeighbors(List<Knight> knights, int index)
    {
        Knight k = knights.get(index);

        if (index == 0) k.setLeftNeighbor(knights.get(knights.size() - 1));
        else k.setLeftNeighbor(knights.get(index - 1));

        if (index == knights.size() - 1) k.setRightNeighborNeighbor(knights.get(0));
        else k.setRightNeighborNeighbor(knights.get(index + 1));
    }

    private int calculateScore(List<Knight> knights)
    {
        int score = 0;

        for (Knight k : knights)
        {
            score += k.getHappinessScore();
        }

        return score;
    }

    public int getScore()
    {
        return this.bestScore;
    }
}
