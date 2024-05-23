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

    public List<Item> getAllWeapons() {
        return weapons;
    }

    public Item getWeapon(int index) {
        return weapons.get(index);
    }

    public Item getArmor(int index) {
        return armor.get(index);
    }

    public Item getRings(int index) {
        return rings.get(index);
    }
}
