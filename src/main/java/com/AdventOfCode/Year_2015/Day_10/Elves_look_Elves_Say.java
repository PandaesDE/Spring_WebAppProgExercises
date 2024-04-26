package com.AdventOfCode.Year_2015.Day_10;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

public class Elves_look_Elves_Say extends AOCExercise {


    @Override
    public String answer1() {
        int repeat = Conveniencer.stringToInt(this.args[0]);
        String output = this.input;

        for (int i = 0; i < repeat; i++)
        {
            output = doLookAndSay(output);
        }

        return "" + output.length();
    }

    @Override
    public String answer2() {
        return answer1();
    }

    private String doLookAndSay(String input)
    {
        if (input.isEmpty()) return "";
        if (input.length() < 2) return "1" + input;

        StringBuilder output = new StringBuilder();

        char previous;
        int amountCounter = 1;

        for (int i = 1; i < input.length(); i++)
        {
            previous = input.charAt(i - 1);
            char current = input.charAt(i);

            if (previous == current)
            {
                amountCounter++;
            } else {
                output.append(amountCounter).append(previous);
                amountCounter = 1;
            }

            if (i == input.length() - 1)
                output.append(amountCounter).append(current);
        }
        return output.toString();
    }
}
