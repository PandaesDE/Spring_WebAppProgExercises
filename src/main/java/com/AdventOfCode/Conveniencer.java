package com.AdventOfCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Conveniencer {

    public static List<String> convertTextToLines(String text)
    {
        return Arrays.stream(text.split("\n")).toList();
    }

    public static List<String> tokenizeString(String line)
    {
        return Arrays.stream(line.split(" ")).toList();
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
    public static int getOccurrenceAmount(String s, String subS) {
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
