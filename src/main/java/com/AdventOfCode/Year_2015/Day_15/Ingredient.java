package com.AdventOfCode.Year_2015.Day_15;

public class Ingredient {
    private String name;
    private int capacity;
    private int durability;

    private int flavor;
    private int texture;
    private int calories;

    public Ingredient(String name, int capacity, int durability, int flavor, int texture, int calories) {
        this.name = name;
        this.capacity = capacity;
        this.durability = durability;
        this.flavor = flavor;
        this.texture = texture;
        this.calories = calories;
    }


    //Getter
    public int getCapacity() {
        return capacity;
    }

    public int getDurability() {
        return durability;
    }

    public int getFlavor() {
        return flavor;
    }

    public int getTexture() {
        return texture;
    }

    public int getCalories() {
        return calories;
    }
}
