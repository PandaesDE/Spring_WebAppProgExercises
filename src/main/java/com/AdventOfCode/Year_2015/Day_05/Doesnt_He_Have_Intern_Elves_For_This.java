package com.AdventOfCode.Year_2015.Day_05;

import java.util.ArrayList;
import java.util.List;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

public class Doesnt_He_Have_Intern_Elves_For_This extends AOCExercise {

    @Override
    public String answer1() {
        return "" + countNiceStrings(input);
    }

    @Override
    public String answer2() {
        return "" + countNiceStringsWithNewRules(input);
    }

    private static int countNiceStringsWithNewRules(String input) {
        int counter = 0;
        List<String> lines = Conveniencer.convertTextToLines(input);
        for (String iterator : lines) {
            if (containsTwoLettersTwiceWithoutOverlap(iterator) && containsRepeatLetterWithOneInBetweenLetter(iterator))
                counter++;
        }
        return counter;
    }

    private static boolean containsTwoLettersTwiceWithoutOverlap(String s) {
        ArrayList<String> twoLetterStrings = new ArrayList<String>();
        // initialize all TwoLetterStrings
        for (int i = 0; i < s.length() - 1; i++)
            twoLetterStrings.add(s.substring(i, i + 2));
        /*
         * For every element in the Arraylist compare to every element in the Arraylist
         * if there are two equal elements in the arraylist, check for overlap (index
         * +-=1)
         * if elements don't overlap, return true
         */
        for (int i = 0; i < twoLetterStrings.size(); i++) {
            for (int j = 0; j < twoLetterStrings.size(); j++) {
                if (twoLetterStrings.get(i).equals(twoLetterStrings.get(j)))
                    if (j != i - 1 && j != i && j != i + 1)
                        return true;
            }
        }
        return false;
    }

    private static boolean containsRepeatLetterWithOneInBetweenLetter(String s) {
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2))
                return true;
        }
        return false;
    }

    private static int countNiceStrings(String input) {
        int counter = 0;
        List<String> lines = Conveniencer.convertTextToLines(input);
        for (String iterator : lines) {
            if (atLeastThreeVowels(iterator) && atLeastOneDoubleLetter(iterator) && noFilterStrings(iterator))
                counter++;
        }

        return counter;
    }

    private static boolean noFilterStrings(String s) {
        String[] filter = { "ab", "cd", "pq", "xy" };
        for (int i = 0; i < filter.length; i++) {
            if (s.contains(filter[i]))
                return false;
        }
        return true;
    }

    private static boolean atLeastOneDoubleLetter(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                return true;
        }
        return false;
    }

    private static boolean atLeastThreeVowels(String s) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        int vowelCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vowels.length; j++)
                if (vowels[j] == s.charAt(i))
                    vowelCounter++;
            if (vowelCounter > 2)
                return true;
        }
        return false;
    }
}
