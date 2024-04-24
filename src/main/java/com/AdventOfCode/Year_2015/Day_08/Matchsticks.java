package com.AdventOfCode.Year_2015.Day_08;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

public class Matchsticks extends AOCExercise {
    private static int chars_literals = 0;
    private static int chars_escaped = 0;
    private static int chars_encoded = 0;

    @Override
    public String answer1() {
        chars_literals = input.length();
        calculateEscapedChars(input);
        return "" + (chars_literals - chars_escaped);
    }

    @Override
    public String answer2() {
        chars_literals = input.length();
        calculateEncodedChars(input);
        return "" + (chars_encoded - chars_literals);
    }

    private static void calculateEncodedChars(String s) {
        chars_encoded = 2;
        chars_encoded += Conveniencer.getOccurrenceAmount(s, "\n") * 2; // including the surrounding double quotes

        for (int cur = 0; cur < chars_literals; cur++) {
            // case: \
            if (s.charAt(cur) == '\\') {
                chars_encoded += 2;
                continue;
            }
            // case: "
            if (s.charAt(cur) == '"') {
                chars_encoded += 2;
                continue;
            }
            chars_encoded++;
        }
    }

    private static void calculateEscapedChars(String s) {
        chars_escaped = 0;
        for (int cur = 0; cur < chars_literals; cur++) {
            // case: \" - lone double-quote character
            if (cur < chars_literals - 1 && s.charAt(cur) == '\\' && s.charAt(cur + 1) == '\\') {
                chars_escaped++;
                cur++;
                continue;
            }
            // case: \\ - single backslash
            if (cur < chars_literals - 1 && s.charAt(cur) == '\\' && s.charAt(cur + 1) == '"') {
                chars_escaped++;
                cur++;
                continue;
            }
            // case: \x00 - single character with that ASCII code
            if (cur < chars_literals - 3 && s.charAt(cur) == '\\' && s.charAt(cur + 1) == 'x') {
                chars_escaped++;
                cur += 3;
                continue;
            }
            // case: "
            if (s.charAt(cur) == '"')
                continue;
            chars_escaped++;
        }
    }
}
