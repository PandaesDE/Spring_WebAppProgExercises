package com.AdventOfCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Conveniencer {

    public static String getProjectPath() {
        return new File("").getAbsolutePath();
    }

    public static String getInput(int year, int day, String fileName) {
        String path = "";
        if (day < 10)
            path = getProjectPath() + "/src/aoc/Year_" + year + "/Day_0" + day + "/" + fileName;
        else
            path = getProjectPath() + "/src/aoc/Year_" + year + "/Day_" + day + "/" + fileName;
        return getInput(path);
    }

    public static String getInput(int year, int day) {
        return getInput(year, day, "input.txt");
    }

    public static String getInput(String path) {
        String input = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while (br.ready()) {
                input += br.readLine() + "\n";
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            return ("");
        }
        return input;
    }

    public static ArrayList<String> convertTextToLines(String text) {
        ArrayList<String> lines = new ArrayList<>();
        // Exception if no breakLine
        if (text.indexOf("\n") == -1) {
            lines.add(text);
            return lines;
        }
        int breakLineIndex = 0;
        int nextBreakLineIndex = 0;
        while (true) {
            nextBreakLineIndex = text.indexOf("\n", breakLineIndex);
            if (nextBreakLineIndex == -1)
                break;
            lines.add(text.substring(breakLineIndex, nextBreakLineIndex));
            breakLineIndex = nextBreakLineIndex + 1;
        }
        return lines;
    }

    public static int stringToInt(String s) {
        try {
            int i = Integer.parseInt(s);
            return i;
        } catch (NumberFormatException e) {
            System.out.println("\"" + s + "\" can not be parsed to an int value, returned int = 0");
            return 0;
        }
    }

    // https://stackoverflow.com/questions/767759/find-the-number-of-occurrences-of-a-substring-in-a-string
    public static int findOccurences(String s, String subS) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = s.indexOf(subS, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subS.length();
            }
        }

        return count;
    }
}
