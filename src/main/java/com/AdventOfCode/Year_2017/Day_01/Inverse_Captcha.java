package com.AdventOfCode.Year_2017.Day_01;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

public class Inverse_Captcha extends AOCExercise {

    @Override
    public String answer1() {
        return "" + getCaptchaAtNextIndex(input);
    }

    @Override
    public String answer2() {
        return "" + getCaptchaAtHalfwayCircle(input);
    }

    private static int getCaptchaAtHalfwayCircle(String input) {
        if (input.charAt(input.length() - 1) == '\n')
            input = input.substring(0, input.length() - 1);

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int adder = Integer.parseInt(String.valueOf(input.charAt(i)));
            if (input.charAt(i) == input.charAt((i + (input.length() / 2)) % input.length())) {
                sum += adder;
            }
        }
        return sum;
    }

    private static int getCaptchaAtNextIndex(String input) {
        // remove last char if it's \n
        if (input.charAt(input.length() - 1) == '\n')
            input = input.substring(0, input.length() - 1);

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int adder = Integer.parseInt(String.valueOf(input.charAt(i)));
            if (i != input.length() - 1) {
                if (input.charAt(i) == input.charAt(i + 1))
                    sum += adder;
            } else if (input.charAt(i) == input.charAt(0))
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        return sum;
    }
}
