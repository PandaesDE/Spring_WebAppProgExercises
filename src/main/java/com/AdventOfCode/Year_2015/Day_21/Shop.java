package com.AdventOfCode.Year_2015.Day_21;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Item> weapons = new ArrayList<>();
    private final List<Item> armor = new ArrayList<>();
    private final List<Item> rings = new ArrayList<>();

    public void addWeapon(Item weapon)
    {
        this.weapons.add(weapon);
    }

    public void addArmor(Item armor)
    {
        this.armor.add(armor);
    }

    public void addRing(Item ring)
    {
        this.rings.add(ring);
    }

    public void sortAllItemsByCost()
    {
        weapons.sort((w1, w2) -> w1.cost - w2.cost);
        armor.sort((a1, a2) -> a1.cost - a2.cost);
        rings.sort((r1, r2) -> r1.cost - r2.cost);
    }

    public Item getWeapon(int index) {
        if (index < 0) return null;
        return weapons.get(index);
    }

    public Item getArmor(int index) {
        if (index < 0) return null;
        return armor.get(index);
    }

    public Item getRing(int index) {
        if (index < 0) return null;
        return rings.get(index);
    }

    public int getWeaponsAmount()
    {
        return weapons.size();
    }

    public int getArmorAmount()
    {
        return armor.size();
    }

    public int getRingsAmount()
    {
        return rings.size();
    }
}
