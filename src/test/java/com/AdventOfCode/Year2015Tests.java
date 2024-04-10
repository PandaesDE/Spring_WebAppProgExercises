package com.AdventOfCode;

import com.AdventOfCode.Year_2015.Day_01.Not_Quite_Lisp;
import com.AdventOfCode.Year_2015.Day_02.I_Was_Told_There_Would_Be_No_Math;
import com.AdventOfCode.Year_2015.Day_03.Perfectly_Spherical_Houses_in_a_Vacuum;
import com.AdventOfCode.Year_2015.Day_04.The_Ideal_Stocking_Stuffer;
import com.AdventOfCode.Year_2015.Day_05.Doesnt_He_Have_Intern_Elves_For_This;
import com.AdventOfCode.Year_2015.Day_06.Probably_a_Fire_Hazard;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Year2015Tests {

    @Test
    void day1_part1()
    {
        AOCExercise d1 = new Not_Quite_Lisp();

        d1.input = "(())";
        Assertions.assertThat(d1.answer1()).isEqualTo("0");

        d1.input = "()()";
        Assertions.assertThat(d1.answer1()).isEqualTo("0");

        d1.input = "(((";
        Assertions.assertThat(d1.answer1()).isEqualTo("3");

        d1.input = "(()(()(";
        Assertions.assertThat(d1.answer1()).isEqualTo("3");

        d1.input = "))(((((";
        Assertions.assertThat(d1.answer1()).isEqualTo("3");

        d1.input = "())";
        Assertions.assertThat(d1.answer1()).isEqualTo("-1");

        d1.input = "))(";
        Assertions.assertThat(d1.answer1()).isEqualTo("-1");

        d1.input = ")))";
        Assertions.assertThat(d1.answer1()).isEqualTo("-3");

        d1.input = ")())())";
        Assertions.assertThat(d1.answer1()).isEqualTo("-3");
    }

    @Test
    void day1_part2()
    {
        AOCExercise ex = new Not_Quite_Lisp();

        ex.input = ")";
        Assertions.assertThat(ex.answer2()).isEqualTo("1");

        ex.input = "()())";
        Assertions.assertThat(ex.answer2()).isEqualTo("5");
    }

    @Test
    void day2_part1()
    {
        AOCExercise ex = new I_Was_Told_There_Would_Be_No_Math();

        ex.input = "2x3x4";
        Assertions.assertThat(ex.answer1()).isEqualTo("58");

        ex.input = "1x1x10";
        Assertions.assertThat(ex.answer1()).isEqualTo("43");
    }

    @Test
    void day2_part2()
    {
        AOCExercise ex = new I_Was_Told_There_Would_Be_No_Math();

        ex.input = "2x3x4";
        Assertions.assertThat(ex.answer2()).isEqualTo("34");

        ex.input = "1x1x10";
        Assertions.assertThat(ex.answer2()).isEqualTo("14");
    }

    @Test
    void day3_part1()
    {
        AOCExercise ex = new Perfectly_Spherical_Houses_in_a_Vacuum();

        ex.input = ">";
        Assertions.assertThat(ex.answer1()).isEqualTo("2");

        ex.input = "^>v<";
        Assertions.assertThat(ex.answer1()).isEqualTo("4");

        ex.input = "^v^v^v^v^v";
        Assertions.assertThat(ex.answer1()).isEqualTo("2");
    }

    @Test
    void day3_part2()
    {
        AOCExercise ex = new Perfectly_Spherical_Houses_in_a_Vacuum();

        ex.input = "^v";
        Assertions.assertThat(ex.answer2()).isEqualTo("3");

        ex.input = "^>v<";
        Assertions.assertThat(ex.answer2()).isEqualTo("3");

        ex.input = "^v^v^v^v^v";
        Assertions.assertThat(ex.answer2()).isEqualTo("11");
    }

    @Test
    void day4_part1()
    {
        AOCExercise ex = new The_Ideal_Stocking_Stuffer();

        ex.input = "abcdef";
        Assertions.assertThat(ex.answer1()).isEqualTo("609043");

        ex.input = "pqrstuv";
        Assertions.assertThat(ex.answer1()).isEqualTo("1048970");
    }

    @Test
    void day4_part2()
    {
        AOCExercise ex = new The_Ideal_Stocking_Stuffer();

        ex.input = "ckczppom";
        Assertions.assertThat(ex.answer2()).isEqualTo("3938038");
    }

    @Test
    void day5_part1()
    {
        AOCExercise ex = new Doesnt_He_Have_Intern_Elves_For_This();

        ex.input = "ugknbfddgicrmopn";
        Assertions.assertThat(ex.answer1()).isEqualTo("1");

        ex.input = "aaa";
        Assertions.assertThat(ex.answer1()).isEqualTo("1");

        ex.input = "jchzalrnumimnmhp";
        Assertions.assertThat(ex.answer1()).isEqualTo("0");

        ex.input = "haegwjzuvuyypxyu";
        Assertions.assertThat(ex.answer1()).isEqualTo("0");

        ex.input = "dvszwmarrgswjxmb";
        Assertions.assertThat(ex.answer1()).isEqualTo("0");
    }

    @Test
    void day5_part2()
    {
        AOCExercise ex = new Doesnt_He_Have_Intern_Elves_For_This();

        ex.input = "qjhvhtzxzqqjkmpb";
        Assertions.assertThat(ex.answer2()).isEqualTo("1");

        ex.input = "xxyxx";
        Assertions.assertThat(ex.answer2()).isEqualTo("1");

        ex.input = "uurcxstgmygtbstg";
        Assertions.assertThat(ex.answer2()).isEqualTo("0");

        ex.input = "ieodomkazucvgmuy";
        Assertions.assertThat(ex.answer2()).isEqualTo("0");
    }

    @Test
    void day6_part1()
    {
        AOCExercise ex = new Probably_a_Fire_Hazard();

        ex.input = "turn on 0,0 through 999,999";
        Assertions.assertThat(ex.answer1()).isEqualTo("1000000");

        ex.input = "turn on 0,0 through 999,0";
        Assertions.assertThat(ex.answer1()).isEqualTo("1000");

        ex.input =  "turn on 0,0 through 999,999\n" +
                    "turn off 499,499 through 500,500";
        Assertions.assertThat(ex.answer1()).isEqualTo("999996");
    }

    @Test
    void day6_part2()
    {
        AOCExercise ex = new Probably_a_Fire_Hazard();

        ex.input = "turn on 0,0 through 0,0";
        Assertions.assertThat(ex.answer2()).isEqualTo("1");

        ex.input = "toggle 0,0 through 999,999";
        Assertions.assertThat(ex.answer2()).isEqualTo("2000000");
    }

    @Test
    void day7_part1()
    {

    }
}
