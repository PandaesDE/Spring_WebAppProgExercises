package com.AdventOfCode.Year_2015.Day_15;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.ArrayList;
import java.util.List;

public class Science_for_Hungry_People extends AOCExercise {
    List<Ingredient> ingredients;

    @Override
    public String answer1() {
        init();
        int totalSpoons = Conveniencer.stringToInt(this.args[0]);
        return "" + new Baker(totalSpoons).calculateBestCookieScore(ingredients, 0);
    }

    @Override
    public String answer2() {
        init();
        int totalSpoons = Conveniencer.stringToInt(this.args[0]);

        return "" + new Baker(totalSpoons).calculateBestCookieScore(ingredients, 500);
    }

    private void init()
    {
        ingredients = new ArrayList<>();
        String input = this.input.replaceAll("[,:]", "");

        Conveniencer.convertTextToLines(input).forEach(line ->
        {
            String[] tokenizedLine = line.split(" ");
            String name = tokenizedLine[0];
            int capacity = Conveniencer.stringToInt(tokenizedLine[2]);
            int durability = Conveniencer.stringToInt(tokenizedLine[4]);
            int flavor = Conveniencer.stringToInt(tokenizedLine[6]);
            int texture = Conveniencer.stringToInt(tokenizedLine[8]);
            int calories = Conveniencer.stringToInt(tokenizedLine[10]);

            ingredients.add(new Ingredient(name, capacity, durability, flavor, texture, calories));
        });
    }
}
