package com.AdventOfCode.Year_2015.Day_01;

import com.AdventOfCode.AOC;
import com.AdventOfCode.Conveniencer;

public class Not_Quite_Lisp extends AOC {

    public Not_Quite_Lisp(String input) {
        super(input);
    }

    public String Answer2() {
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

    public String Answer1() {
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
