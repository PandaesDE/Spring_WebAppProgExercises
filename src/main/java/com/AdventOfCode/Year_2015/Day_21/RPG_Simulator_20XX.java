package com.AdventOfCode.Year_2015.Day_21;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.List;

public class RPG_Simulator_20XX extends AOCExercise {
    private Shop shop;
    private Character player;
    private Character boss;

    @Override
    public String answer1() {
        init();
        return "" + getMinimalGoldForWin();
    }

    @Override
    public String answer2() {
        init();
        return "" + getMaximalGoldForLose();
    }

    private int getMinimalGoldForWin()
    {
        int minGold = Integer.MAX_VALUE;

        for (int weaponIndex = 0; weaponIndex < shop.getWeaponsAmount(); weaponIndex++)
        {
            for (int armorIndex = -1; armorIndex < shop.getArmorAmount(); armorIndex++)
            {
                for (int ring1Index = -1; ring1Index < shop.getRingsAmount(); ring1Index++)
                {
                    for (int ring2Index = -1; ring2Index < shop.getRingsAmount(); ring2Index++)
                    {
                        if (ring1Index == ring2Index) continue;

                        int goldSum = getMoneySumForEquipment(weaponIndex, armorIndex, ring1Index, ring2Index);
                        if (goldSum > minGold) continue;

                        int playerHits = player.hitsUntilDefeated(boss.getDamage());
                        int bossHits = boss.hitsUntilDefeated(player.getDamage());

                        if (bossHits <= playerHits)
                        {
                            if (goldSum < minGold) minGold = goldSum;
                        }
                    }
                }
            }
        }

        return minGold;
    }

    private int getMaximalGoldForLose()
    {
        int maxGold = 0;

        for (int weaponIndex = 0; weaponIndex < shop.getWeaponsAmount(); weaponIndex++)
        {
            for (int armorIndex = -1; armorIndex < shop.getArmorAmount(); armorIndex++)
            {
                for (int ring1Index = -1; ring1Index < shop.getRingsAmount(); ring1Index++)
                {
                    for (int ring2Index = -1; ring2Index < shop.getRingsAmount(); ring2Index++)
                    {
                        if (ring1Index == ring2Index) continue;

                        int goldSum = getMoneySumForEquipment(weaponIndex, armorIndex, ring1Index, ring2Index);
                        if (goldSum < maxGold) continue;

                        int playerHits = player.hitsUntilDefeated(boss.getDamage());
                        int bossHits = boss.hitsUntilDefeated(player.getDamage());

                        if (bossHits > playerHits)
                        {
                            if (goldSum > maxGold) maxGold = goldSum;
                        }
                    }
                }
            }
        }

        return maxGold;
    }

    private int getMoneySumForEquipment(int weaponIndex, int armorIndex, int ring1Index, int ring2Index)
    {
        Item weapon = shop.getWeapon(weaponIndex);
        Item armor = shop.getArmor(armorIndex);
        Item ring1 = shop.getRing(ring1Index);
        Item ring2 = shop.getRing(ring2Index);

        player.equipWeapon(weapon);
        player.equipArmor(armor);
        player.equipRing(ring1, 0);
        player.equipRing(ring2, 1);

        return player.getSumOfAllEquippedItems();
    }

    private void init()
    {
        initShop();
        initCharacters();
    }

    private void initCharacters()
    {
        this.player = new Character(100);
        int hitPoints = 0;
        int damage = 0;
        int armor = 0;

        for (String line : Conveniencer.convertTextToLines(this.input))
        {
            String[] tokenizedLine = line.split("\\s+");
            if (line.contains("Hit Points:")) hitPoints = Conveniencer.stringToInt(tokenizedLine[2]);
            if (line.contains("Damage:")) damage = Conveniencer.stringToInt(tokenizedLine[1]);
            if (line.contains("Armor:")) armor = Conveniencer.stringToInt(tokenizedLine[1]);
        }

        this.boss = new Character(hitPoints, damage, armor);
    }

    private void initShop()
    {
        this.shop = new Shop();
        String type = "";

        for (String line : Conveniencer.convertTextToLines(this.args[0]))
        {
            if (line.isEmpty()) continue;

            if (line.contains("Weapons:")) type = "weapon";
            else if (line.contains("Armor:")) type = "armor";
            else if (line.contains("Rings:")) type = "ring";
            else
            {
                int spacesInName = type.equals("ring") ? 1 : 0;
                Item shopItem = getItemFromInput(line.split("\\s+"), spacesInName);

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
        shop.sortAllItemsByCost();
    }

    private Item getItemFromInput(String[] splitInput, int spacesInName)
    {
        int cost = Conveniencer.stringToInt(splitInput[1 + spacesInName]);
        int damage = Conveniencer.stringToInt(splitInput[2 + spacesInName]);
        int armor = Conveniencer.stringToInt(splitInput[3 + spacesInName]);

        return new Item(cost, damage, armor);
    }

}
