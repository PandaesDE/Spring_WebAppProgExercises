package com.AdventOfCode.Year_2016.Day_02;

import java.util.List;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

public class Bathroom_Security extends AOCExercise {

    @Override
    public String answer1() {
        return getCode(input);
    }

    @Override
    public String answer2() {
        return getNewCode(input);
    }

    private static String getNewCode(String instructions) {
        String code = "";
        List<String> codeLines = Conveniencer.convertTextToLines(instructions);
        for (String iterator : codeLines) {
            code += getNewDialNumber(iterator);
        }
        return code;
    }

    private static char getNewDialNumber(String instruction) {
        char[][] dial = { { '0', '0', '5', '0', '0' }, { '0', '2', '6', 'A', '0' }, { '1', '3', '7', 'B', 'D' },
                { '0', '4', '8', 'C', '0' }, { '0', '0', '9', '0', '0' } };
        int dialDown = 1;
        int dialRight = 1;
        for (int i = 0; i < instruction.length(); i++) {
            switch (instruction.toUpperCase().charAt(i)) {
                case 'U':
                    if (dialDown > 0)
                        if (dial[dialRight][dialDown - 1] != '0')
                            dialDown--;
                    break;
                case 'R':
                    if (dialRight < 4)
                        if (dial[dialRight + 1][dialDown] != '0')
                            dialRight++;
                    break;
                case 'D':
                    if (dialDown < 4)
                        if (dial[dialRight][dialDown + 1] != '0')
                            dialDown++;
                    break;
                case 'L':
                    if (dialRight > 0)
                        if (dial[dialRight - 1][dialDown] != '0')
                            dialRight--;
                    break;
                default:
                    break;
            }
        }
        return dial[dialRight][dialDown];
    }

    private static String getCode(String instructions) {
        String code = "";
        List<String> codeLines = Conveniencer.convertTextToLines(instructions);
        for (String iterator : codeLines) {
            code += getDialNumber(iterator);
        }
        return code;
    }

    private static int getDialNumber(String instruction) {
        int[][] dial = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
        int dialDown = 1;
        int dialRight = 1;
        for (int i = 0; i < instruction.length(); i++) {
            switch (instruction.toUpperCase().charAt(i)) {
                case 'U':
                    if (dialDown > 0)
                        dialDown--;
                    break;
                case 'R':
                    if (dialRight < 2)
                        dialRight++;
                    break;
                case 'D':
                    if (dialDown < 2)
                        dialDown++;
                    break;
                case 'L':
                    if (dialRight > 0)
                        dialRight--;
                    break;
                default:
                    break;
            }
        }
        return dial[dialRight][dialDown];
    }
}
