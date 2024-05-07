package com.AdventOfCode.Year_2015.Day_16;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.ArrayList;
import java.util.List;

public class Aunt_Sue extends AOCExercise {
    private Sue MFCSAMScan;
    @Override
    public String answer1() {
        initMFCSAMScan();
        return "" + getTrueSue(false);
    }

    @Override
    public String answer2() {
        initMFCSAMScan();
        return "" + getTrueSue(true);
    }

    private void initMFCSAMScan()
    {
        MFCSAMScan = new Sue(0);
        String arg = this.args[0].replaceAll(":","");

        Conveniencer.convertTextToLines(arg).forEach(line -> {
            String[] tokenizedLine = line.split(" ");
            addDetail(MFCSAMScan, tokenizedLine[0], Conveniencer.stringToInt(tokenizedLine[1]));
        });
    }

    private int getTrueSue(boolean withOutdatedRetroencabulator)
    {
        String input = this.input.replaceAll("[,:]", "");

        for (String s : Conveniencer.convertTextToLines(input)) {
            String[] tokenizedLine = s.split(" ");
            int id = Conveniencer.stringToInt(tokenizedLine[1]);

            Sue sue = new Sue(id);
            addDetail(sue, tokenizedLine[2], Conveniencer.stringToInt(tokenizedLine[3]));
            addDetail(sue, tokenizedLine[4], Conveniencer.stringToInt(tokenizedLine[5]));
            addDetail(sue, tokenizedLine[6], Conveniencer.stringToInt(tokenizedLine[7]));

            if (MFCSAMScan.probablyEquals(sue, withOutdatedRetroencabulator)) return id;
        }

        return 0;
    }

    private void addDetail(Sue sue, String detail, int amount)
    {
        switch (detail)
        {
            case "children":
                sue.setChildren(amount);
                break;
            case "cats":
                sue.setCats(amount);
                break;
            case "samoyeds":
                sue.setSamoyeds(amount);
                break;
            case "pomeranians":
                sue.setPomeranians(amount);
                break;
            case "akitas":
                sue.setAkitas(amount);
                break;
            case "vizslas":
                sue.setVizslas(amount);
                break;
            case "goldfish":
                sue.setGoldfishes(amount);
                break;
            case "trees":
                sue.setTrees(amount);
                break;
            case "cars":
                sue.setCars(amount);
                break;
            case "perfumes":
                sue.setPerfumes(amount);
                break;
        }
    }
}
