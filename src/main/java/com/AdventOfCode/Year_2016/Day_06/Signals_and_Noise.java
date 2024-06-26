package com.AdventOfCode.Year_2016.Day_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

public class Signals_and_Noise extends AOCExercise {

    @Override
    public String answer1() {
        return getErrorCorrectedVersion(createColumnStrings(input));
    }

    @Override
    public String answer2() {
        return getNewErrorCorrectedVersion(createColumnStrings(input));
    }

    private static String getNewErrorCorrectedVersion(ArrayList<String> columnStrings) {
        String message = "";
        for (String iString : columnStrings) {
            message += getLeastCommonCharOfString(iString);
        }
        return message;
    }

    private static char getLeastCommonCharOfString(String input) {
        HashMap<Character, Integer> characterAmount = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (characterAmount.containsKey(input.charAt(i)))
                characterAmount.replace(input.charAt(i), characterAmount.get(input.charAt(i)) + 1);
            else
                characterAmount.put(input.charAt(i), 1);
        }
        char leastUsedChar = ' ';
        int minValue = characterAmount.get(characterAmount.keySet().iterator().next());
        for (char iChar : characterAmount.keySet())
            if (characterAmount.get(iChar) < minValue) {
                minValue = characterAmount.get(iChar);
                leastUsedChar = iChar;
            }
        return leastUsedChar;
    }

    private static String getErrorCorrectedVersion(ArrayList<String> columnStrings) {
        String message = "";
        for (String iString : columnStrings) {
            message += getMostCommonCharOfString(iString);
        }
        return message;
    }

    private static char getMostCommonCharOfString(String input) {
        char mostUsedChar = ' ';
        int maxValue = 0;
        HashMap<Character, Integer> characterAmount = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (characterAmount.containsKey(input.charAt(i)))
                characterAmount.replace(input.charAt(i), characterAmount.get(input.charAt(i)) + 1);
            else
                characterAmount.put(input.charAt(i), 1);
            if (characterAmount.get(input.charAt(i)) > maxValue) {
                maxValue = characterAmount.get(input.charAt(i));
                mostUsedChar = input.charAt(i);
            }
        }
        return mostUsedChar;
    }

    private static ArrayList<String> createColumnStrings(String input) {
        String column = "";
        List<String> lines = Conveniencer.convertTextToLines(input);
        ArrayList<String> columns = new ArrayList<String>();
        for (int i = 0; i < input.substring(0, input.indexOf("\n")).length(); i++) {
            for (String iString : lines) {
                column += iString.charAt(i);
            }
            columns.add(column);
            column = "";
        }
        return columns;
    }
}
