package com.AdventOfCode.Year_2016.Day_04;

import java.util.*;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

public class Security_Through_Obscurity extends AOCExercise {

    @Override
    public String answer1() {
        return "" + getSectorIDSum(input);
    }

    @Override
    public String answer2() {
        return "" + getNorthPoleSectorID(input);
    }

    private static int getNorthPoleSectorID(String input) {
        List<String> lines = Conveniencer.convertTextToLines(input);
        for (String iString : lines) {
            if (decryptRoomName(iString).equals("northpole-object-storage"))
                return getSectorID(iString);
        }
        return 0;
    }

    private static String decryptRoomName(String room) {
        String decryptetName = "";
        int key = getSectorID(room);
        int alphabetSize = 'z' - 'a' + 1;
        room = room.substring(0, room.lastIndexOf('-'));
        for (int i = 0; i < room.length(); i++) {
            if (room.charAt(i) >= 'a' && room.charAt(i) <= 'z') {
                decryptetName += (char) (('a' + (room.charAt(i) - 'a' + key) % (alphabetSize)));
            } else
                decryptetName += room.charAt(i);
        }
        return decryptetName;
    }

    private static int getSectorIDSum(String input) {
        int counter = 0;
        List<String> lines = Conveniencer.convertTextToLines(input);
        for (String iString : lines) {
            if (checkSumName(iString))
                counter += getSectorID(iString);
        }
        return counter;
    }

    private static int getSectorID(String room) {
        int endIndex = room.indexOf('[');
        int startIndex = endIndex;
        while (true) {
            startIndex--;
            if (room.charAt(startIndex) < '0' || room.charAt(startIndex) > '9')
                break;
        }
        return Conveniencer.stringToInt(room.substring(startIndex + 1, endIndex));
    }

    private static boolean checkSumName(String room) {
        String checkSum = room.substring(room.indexOf('[') + 1, room.indexOf(']'));
        if (checkSum.equals(getTrueCheckSum(room)))
            return true;
        else
            return false;
    }

    private static String getTrueCheckSum(String room) {
        int checkSumLength = 5;
        String checkSum = room.substring(0, room.lastIndexOf('-'));
        checkSum = checkSum.replaceAll("-", "");
        checkSum = getAlphabeticalOrderedString(checkSum);
        List<String> letters = getLetterList(checkSum);
        letters = sortByStringlength(letters);
        checkSum = "";
        for (int i = 0; i < checkSumLength; i++) {
            checkSum += letters.get(i).charAt(0);
        }
        return checkSum;
    }

    // https://stackoverflow.com/questions/31629964/sorting-arraylist-by-sting-length-in-java
    private static List<String> sortByStringlength(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        return list;
    }

    private static List<String> getLetterList(String line) {
        List<String> letters = new ArrayList<>();
        int startIndex = 0;
        for (int i = 0; i <= line.length(); i++) {
            while (true) {
                if (i == line.length())
                    break;
                if (line.charAt(startIndex) != line.charAt(i))
                    break;
                i++;
            }
            letters.add(line.substring(startIndex, i));
            startIndex = i;
        }
        return letters;
    }

    private static String getAlphabeticalOrderedString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
