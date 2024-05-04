package com.AdventOfCode.Year_2015.Day_13;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.List;

public class Knights_of_the_Dinner_Table extends AOCExercise {
    DinnerTable dinnerTable;
    @Override
    public String answer1() {
        initialize();
        dinnerTable.doConfiguration();
        dinnerTable.optimizeConfiguration();
        return "" + dinnerTable.getScore();
    }

    @Override
    public String answer2() {
        initialize();
        dinnerTable.addKnight(new Knight("Me"));
        dinnerTable.doConfiguration();
        dinnerTable.optimizeConfiguration();
        return "" + dinnerTable.getScore();
    }

    private void initialize()
    {
        dinnerTable = new DinnerTable();
        String input = this.input.replaceAll("\\.", "");
        List<String> inputLines = Conveniencer.convertTextToLines(input);
        inputLines.forEach(line -> {
            String[] tokenizedLine = line.split(" ");
            String knightName1 = tokenizedLine[0];
            String knightName2 = tokenizedLine[10];
            boolean isSympathyNegative = tokenizedLine[2].equals("lose");
            int sympathy = Conveniencer.stringToInt(tokenizedLine[3]);

            if (isSympathyNegative) sympathy = -sympathy;
            dinnerTable.addKnight(new Knight(knightName1), new Knight(knightName2), sympathy);
        });
    }
}
