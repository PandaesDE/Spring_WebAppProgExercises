package com.AdventOfCode.Year_2015.Day_15;

import java.util.ArrayList;
import java.util.List;

public class Baker {
    private int bestScore = 0;
    private int maxTeeSpoons;
    private int exactCalorieAmount;
    private boolean mustHaveExactCalories = false;

    public Baker(int maxTeeSpoons)
    {
        this.maxTeeSpoons = maxTeeSpoons;
    }

    public int calculateBestCookieScore(List<Ingredient> ingredients, int exactCalories)
    {
        if (exactCalories > 0)
        {
            this.exactCalorieAmount = exactCalories;
            this.mustHaveExactCalories = true;
        }

        calculateBestScoreRecursively(ingredients, new ArrayList<>(), 0);
        return this.bestScore;
    }

    private void calculateBestScoreRecursively(List<Ingredient> ingredients, List<Integer> ingredientAmounts, int depth)
    {
        int ingredientAmountsSum = ingredientAmounts.stream().reduce(0, Integer::sum);

        //base Case
        if (depth == ingredients.size() - 1)
        {
             int lastIngredientAmount = this.maxTeeSpoons - ingredientAmountsSum;
             setOrAddToList(ingredientAmounts, lastIngredientAmount, depth);

             int score = calculateCookieScore(ingredients, ingredientAmounts);
             if (this.bestScore < score) this.bestScore = score;
        }
        else
        {
            for (int ingredientAmount = 0; ingredientAmount < this.maxTeeSpoons - ingredientAmountsSum; ingredientAmount++)
            {
                setOrAddToList(ingredientAmounts, ingredientAmount, depth);

                calculateBestScoreRecursively(ingredients, new ArrayList<>(ingredientAmounts), depth + 1);
            }
        }
    }

    private void setOrAddToList(List<Integer> list,int value, int index)
    {
        if (index >= list.size())
            list.add(value);
        else
            list.set(index, value);
    }

    private int calculateCookieScore(List<Ingredient> ingredients, List<Integer> amounts)
    {
        int capacity = 0;
        int durability = 0;
        int flavor = 0;
        int texture = 0;
        int calories = 0;


        for (int index = 0; index < ingredients.size(); index++)
        {
            Ingredient ingredient = ingredients.get(index);
            int amount = amounts.get(index);

            capacity += ingredient.getCapacity() * amount;
            durability += ingredient.getDurability() * amount;
            flavor += ingredient.getFlavor() * amount;
            texture += ingredient.getTexture() * amount;
            calories += ingredient.getCalories() * amount;
        }

        if (mustHaveExactCalories && calories != exactCalorieAmount) return 0;
        if (capacity <= 0 || durability <= 0 || flavor <= 0 || texture <= 0) return 0;
        return capacity * durability * flavor * texture;
    }
}
