package com.AdventOfCode.Year_2015.Day_01;

import com.AdventOfCode.AOCExercise;

public class Not_Quite_Lisp extends AOCExercise {

    public String answer2() {
        int par = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(')
                par++;
            if (input.charAt(i) == ')')
                par--;
            if (par == -1)
                return "" + (i + 1);
        }
        return "" + par;
    }

    public String answer1() {
        int par = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(')
                par++;
            if (input.charAt(i) == ')')
                par--;
        }
        return "" + par;
    }

}