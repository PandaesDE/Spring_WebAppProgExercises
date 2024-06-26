package com.AdventOfCode.Year_2015.Day_03;

import java.util.ArrayList;

import com.AdventOfCode.AOCExercise;

public class Perfectly_Spherical_Houses_in_a_Vacuum extends AOCExercise {

    public String answer1() {
        return "" + getTotalHouseAmount(input);
    }

    public String answer2() {
        return "" + getTotalHouseAmountWithRoboSanta(input);
    }

    private static int getTotalHouseAmountWithRoboSanta(String instructions) {
        ArrayList<Pair> housesWithPresent = new ArrayList<Pair>();
        housesWithPresent.add(new Pair(0, 0));
        int santaX = 0;
        int santaY = 0;
        int roboX = 0;
        int roboY = 0;
        for (int i = 0; i < instructions.length(); i++) {
            if (i % 2 == 0) {
                santaX += getXInstruction(instructions.charAt(i));
                santaY += getYInstruction(instructions.charAt(i));
                housesWithPresent = addNonDuplicatePair(housesWithPresent, santaX, santaY);
            } else {
                roboX += getXInstruction(instructions.charAt(i));
                roboY += getYInstruction(instructions.charAt(i));
                housesWithPresent = addNonDuplicatePair(housesWithPresent, roboX, roboY);
            }
        }
        return housesWithPresent.size();
    }

    private static ArrayList<Pair> addNonDuplicatePair(ArrayList<Pair> ndl, int x, int y) {
        boolean add = true;
        Pair comparison = new Pair(x, y);
        for (Pair iterator : ndl) {
            if (Pair.equalPair(iterator, comparison))
                add = false;
        }
        if (add)
            ndl.add(new Pair(x, y));
        return ndl;
    }

    private static int getTotalHouseAmount(String instructions) {
        ArrayList<Pair> housesWithPresent = new ArrayList<Pair>();
        housesWithPresent.add(new Pair(0, 0)); // starting value
        int x = 0;
        int y = 0;

        for (int i = 0; i < instructions.length(); i++) {
            x += getXInstruction(instructions.charAt(i));
            y += getYInstruction(instructions.charAt(i));
            boolean add = true;
            Pair comparison = new Pair(x, y);
            for (Pair iterator : housesWithPresent) {
                if (Pair.equalPair(iterator, comparison))
                    add = false;
            }
            if (add)
                housesWithPresent.add(new Pair(x, y));

        }
        return housesWithPresent.size();
    }

    private static int getYInstruction(char instruction) {
        switch (instruction) {
            case '^':
                return 1;
            case 'v':
                return -1;
            default:
                return 0;
        }
    }

    private static int getXInstruction(char instruction) {
        switch (instruction) {
            case '>':
                return 1;
            case '<':
                return -1;
            default:
                return 0;
        }
    }

}
