package com.AdventOfCode.Year_2015.Day_21;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.List;

public class RPG_Simulator_20XX extends AOCExercise {
    private Shop shop;

    @Override
    public String answer1() {
        init();
        return null;
    }

    @Override
    public String answer2() {
        return null;
    }

    private void init()
    {
        this.shop = new Shop();
        String type = "";

        List<String> lines = Conveniencer.convertTextToLines(this.args[0]);

        for (String line : lines)
        {
            type = changeTypeIfNeeded(line, type);
            int spacesInName = type.equals("ring") ? 1 : 0;
            Item shopItem = getItemFromInput(line.split(" "), spacesInName);

            switch (type)
            {
                case "weapon":
                    shop.addWeapon(shopItem);
                    break;
                case "armor":
                    shop.addArmor(shopItem);
                    break;
                case "ring":
                    shop.addRing(shopItem);
                    break;
            }
        }
    }

    private Item getItemFromInput(String[] splitInput, int spacesInName)
    {
        int cost = Conveniencer.stringToInt(splitInput[1 + spacesInName]);
        int damage = Conveniencer.stringToInt(splitInput[2 + spacesInName]);
        int armor = Conveniencer.stringToInt(splitInput[3 + spacesInName]);

        return new Item(cost, damage, armor);
    }

    private String changeTypeIfNeeded(String input, String type)
    {
        if (input.contains("Weapons:")) return "weapon";
        else if (input.contains("Armor:")) return "armor";
        else if (input.contains("Rings:")) return "ring";
        return type;
    }
}
