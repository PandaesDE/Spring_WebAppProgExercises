package com.AdventOfCode.Year_2015.Day_21;

public class Character {
    private int hitPoints;
    private int damage;
    private int armor;

    private Item weapon;
    private Item Armor;
    private Item[] Rings;

    public Character(int hitPoints)
    {
        this(hitPoints, 0, 0);
    }

    public Character(int hitPoints, int damage, int armor)
    {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.armor = armor;
    }
}
