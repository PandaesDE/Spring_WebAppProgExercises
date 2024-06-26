package com.AdventOfCode.Year_2015.Day_06;

import java.util.ArrayList;
import java.util.List;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

public class Probably_a_Fire_Hazard extends AOCExercise {
    private static final int LIGHTS_X = 1000;
    private static final int LIGHTS_Y = 1000;
    private static boolean[][] lights = new boolean[LIGHTS_Y][LIGHTS_X];
    private static int[][] brightLights = new int[LIGHTS_Y][LIGHTS_X];


    @Override
    public String answer1() {
        initializeLightsandBrightLights();
        initializeInstructions(input);
        return "" + countLitLights();
    }

    @Override
    public String answer2() {
        initializeLightsandBrightLights();
        initializeInstructionsByBrightness(input);
        return "" + getTotalBrightness();
    }

    private static int getTotalBrightness() {
        int brightness = 0;
        for (int i = 0; i < LIGHTS_Y; i++)
            for (int j = 0; j < LIGHTS_X; j++) {
                brightness += brightLights[i][j];
            }
        return brightness;
    }

    private static int countLitLights() {
        int counter = 0;
        for (int i = 0; i < LIGHTS_Y; i++) {
            for (int j = 0; j < LIGHTS_X; j++) {
                if (lights[i][j])
                    counter++;
            }
        }
        return counter;
    }

    private static void initializeInstructionsByBrightness(String input) {
        List<String> lines = Conveniencer.convertTextToLines(input);
        for (String iterator : lines) {
            String ints = trimLetters(iterator);
            ints = seperateInts(ints);
            int[] values = getValues(ints);
            operateBrightnessInstructions(iterator, values);
        }
    }

    private static void initializeInstructions(String input) {
        List<String> lines = Conveniencer.convertTextToLines(input);
        for (String iterator : lines) {
            String ints = trimLetters(iterator);
            ints = seperateInts(ints);
            int[] values = getValues(ints);
            operateInstruction(iterator, values);
        }
    }

    private static int[] getValues(String ints) {
        int[] values = new int[4];
        int startindex = 0;
        for (int i = 0; i < values.length; i++) {
            int nextIndex = ints.indexOf(",", startindex);
            if (nextIndex == -1)
                nextIndex = ints.length();
            values[i] = Conveniencer.stringToInt(ints.substring(startindex, nextIndex));
            startindex = nextIndex + 1;
        }
        return values;
    }

    private static void operateBrightnessInstructions(String operation, int[] values) {
        if (operation.contains("turn on")) {
            increaseLightsByOneThroughSquare(values[0], values[1], values[2], values[3]);
            return;
        }
        if (operation.contains("turn off")) {
            decreaseLightsByOneThroughSquare(values[0], values[1], values[2], values[3]);
            return;
        }
        if (operation.contains("toggle")) {
            increaseLightsByTwoThroughSquare(values[0], values[1], values[2], values[3]);
            return;
        }
    }

    private static void operateInstruction(String operation, int[] values) {
        if (operation.contains("turn on")) {
            turnOnLightsThroughSquare(values[0], values[1], values[2], values[3]);
            return;
        }
        if (operation.contains("turn off")) {
            turnOffLightsThroughSquare(values[0], values[1], values[2], values[3]);
            return;
        }
        if (operation.contains("toggle")) {
            toggleLightsThroughSquare(values[0], values[1], values[2], values[3]);
            return;
        }
    }

    private static String seperateInts(String s) {
        s = s.replaceAll(" ", ",");
        // trim start commas
        if (s.charAt(0) == ',') {
            int startIndex = 0;
            while (true) {
                if (s.charAt(startIndex) == ',')
                    startIndex++;
                else {
                    s = s.substring(startIndex);
                    break;
                }
            }
        }
        // seperate ints by one comma
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ',' && s.charAt(i + 1) == ',')
                s = s.substring(0, i) + s.substring(i + 1);
        }
        return s;
    }

    private static String trimLetters(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == ' ' || s.charAt(i) == ',') {
                output += s.charAt(i);
            }
        }
        return output;
    }

    private static void initializeLightsandBrightLights() {
        for (int i = 0; i < LIGHTS_Y; i++) {
            for (int j = 0; j < LIGHTS_X; j++) {
                lights[i][j] = false;
                brightLights[i][j] = 0;
            }
        }

    }

    private static void increaseLightsByOneThroughSquare(int x1, int y1, int x2, int y2) {
        int width = x2 - x1 + 1;
        int height = y2 - y1 + 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                brightLights[(y1 + i)][(x1 + j)]++;
            }
        }
    }

    private static void decreaseLightsByOneThroughSquare(int x1, int y1, int x2, int y2) {
        int width = x2 - x1 + 1;
        int height = y2 - y1 + 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (brightLights[(y1 + i)][(x1 + j)] != 0)
                    brightLights[(y1 + i)][(x1 + j)]--;
            }
        }
    }

    private static void increaseLightsByTwoThroughSquare(int x1, int y1, int x2, int y2) {
        int width = x2 - x1 + 1;
        int height = y2 - y1 + 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                brightLights[(y1 + i)][(x1 + j)] += 2;
            }
        }
    }

    private static void toggleLightsThroughSquare(int x1, int y1, int x2, int y2) {
        int width = x2 - x1 + 1;
        int height = y2 - y1 + 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (lights[(y1 + i)][(x1 + j)])
                    lights[(y1 + i)][(x1 + j)] = false;
                else
                    lights[(y1 + i)][(x1 + j)] = true;
            }
        }
    }

    private static void turnOnLightsThroughSquare(int x1, int y1, int x2, int y2) {
        int width = x2 - x1 + 1;
        int height = y2 - y1 + 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                lights[(y1 + i)][(x1 + j)] = true;
            }
        }
    }

    private static void turnOffLightsThroughSquare(int x1, int y1, int x2, int y2) {
        int width = x2 - x1 + 1;
        int height = y2 - y1 + 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                lights[(y1 + i)][(x1 + j)] = false;
            }
        }
    }
}
