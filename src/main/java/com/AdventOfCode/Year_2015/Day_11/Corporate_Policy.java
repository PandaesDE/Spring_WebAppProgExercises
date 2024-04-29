package com.AdventOfCode.Year_2015.Day_11;

import com.AdventOfCode.AOCExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Corporate_Policy extends AOCExercise {

    /*  General Notes:
        Because a Password can never contain i,o or l you can always increment those specific chars at its locations to optimize the performance of this code.
    * */

    @Override
    public String answer1() {
        return incrementUntilValid();
    }

    @Override
    public String answer2() {
        this.input = incrementUntilValid();
        this.input = incrementPassword(this.input);
        return incrementUntilValid();
    }

    private String incrementUntilValid()
    {
        String output = this.input;

        while (!validPassword(output))
        {
            output = incrementPassword(output);
        }

        return output;
    }

    private boolean validPassword(String password)
    {
        return includesIncreasingStraightLetters(password, 3) &&
                noConfusingLetters(password) &&
                differentNonOverlappingPairs(password);
    }

    private boolean includesIncreasingStraightLetters(String password, int straightLetterAmount)
    {
        for (int i = 0; i < password.length() - straightLetterAmount; i++)
        {
            char focus = password.charAt(i);
            boolean allLettersIncrease = true;

            for (int j = 1; j < straightLetterAmount; j++)
            {
                if (password.charAt(i + j) != (char)(focus + j))
                {
                    allLettersIncrease = false;
                    break;
                }
            }

            if (allLettersIncrease) return true;
        }
        return false;
    }

    private boolean noConfusingLetters(String password)
    {
        for (int i = 0; i < password.length(); i++)
        {
            char focus = password.charAt(i);
            if (focus == 'i' || focus == 'o' || focus == 'l') return false;
        }

        return true;
    }

    private boolean differentNonOverlappingPairs(String password)
    {
        char pair1 = Character.UNASSIGNED;

        for (int i = 0; i < password.length() - 1; i++)
        {
            char focus = password.charAt(i);

            if (focus == password.charAt(i + 1))
            {
                if (pair1 == Character.UNASSIGNED)
                {
                    pair1 = focus;
                    i++;
                    continue;
                }

                if (focus != pair1) return true;
                else i++;
            }
        }

        return false;
    }

    private String incrementPassword(String password)
    {
        if (password.isEmpty()) return password;

        String safePart = "";
        char focusChar = password.charAt(password.length() - 1);

        if (password.length() > 1)
            safePart = password.substring(0, password.length() - 1);

        if (focusChar == 'z')
        {
            return incrementPassword(safePart) + (char)(focusChar - 25);
        }

        return safePart + (char)(focusChar + 1);
    }
}
