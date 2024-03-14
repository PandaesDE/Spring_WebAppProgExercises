package com.Spring.service;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Year_2015.Day_01.Not_Quite_Lisp;
import com.AdventOfCode.Year_2015.Day_02.I_Was_Told_There_Would_Be_No_Math;
import com.AdventOfCode.Year_2015.Day_03.Perfectly_Spherical_Houses_in_a_Vacuum;
import com.AdventOfCode.Year_2015.Day_04.The_Ideal_Stocking_Stuffer;

import java.util.HashMap;

public class AOCService {

    private final HashMap<String, AOCExercise> AOCLogicMap = new HashMap<String, AOCExercise>() {{
        put("20151", new Not_Quite_Lisp());
        put("20152", new I_Was_Told_There_Would_Be_No_Math());
        put("20153", new Perfectly_Spherical_Houses_in_a_Vacuum());
        put("20154", new The_Ideal_Stocking_Stuffer());
    }};

    public String getAnswer(int year, int day) {
        String key = "" + year + day;
        if (!AOCLogicMap.containsKey(key)) {
            return "this exercise has not been done yet";
        }
        AOCExercise req = AOCLogicMap.get(key);
        return "a1: " + req.answer1() + " | a2: " + req.answer2();
    }

}
