package com.AdventOfCode.Year_2015.Day_14;

import com.AdventOfCode.AOCExercise;
import com.AdventOfCode.Conveniencer;

import java.util.*;

public class Reindeer_Olympics extends AOCExercise {
    private List<Reindeer> participants;
    @Override
    public String answer1() {
        init();
        return "" + getBestReindeerDistance();
    }

    @Override
    public String answer2() {
        init();
        return "" + getBestScoredReindeer();
    }

    private int getBestReindeerDistance()
    {
        int bestDistance = 0;
        int raceTime = Conveniencer.stringToInt(this.args[0]);

        for (Reindeer participant : participants)
        {
            int distance = participant.calculateDistance(raceTime);
            if (distance > bestDistance)
            {
                bestDistance = distance;
            }
        }

        return bestDistance;
    }

    private int getBestScoredReindeer()
    {
        int bestScore = 0;

        initPointedRace();
        for (Reindeer participant : this.participants)
        {
            int score = participant.getScore();
            if (score > bestScore)
            {
                bestScore = score;
            }
        }

        return bestScore;
    }

    private void initPointedRace()
    {
        int raceTime = Conveniencer.stringToInt(this.args[0]);

        Set<Reindeer> leadingReindeers = new HashSet<>();
        int bestDistance = 0;

        for (int i = 1; i <= raceTime; i++)
        {
            for (Reindeer participant : participants)
            {
                int distance = participant.calculateDistance(i);
                if (distance > bestDistance)
                {
                    bestDistance = distance;
                    leadingReindeers = new HashSet<>();
                    leadingReindeers.add(participant);
                } else if (distance == bestDistance)
                {
                    leadingReindeers.add(participant);
                }
            }
            leadingReindeers.forEach(Reindeer::award);
        }
    }

    private void init()
    {
        this.participants = new ArrayList<>();
        Conveniencer.convertTextToLines(this.input).forEach(line -> {
            String[] tokenizedLine = line.split(" ");
            String name = tokenizedLine[0];
            int speed = Conveniencer.stringToInt(tokenizedLine[3]);
            int dashTime = Conveniencer.stringToInt(tokenizedLine[6]);
            int restTime = Conveniencer.stringToInt(tokenizedLine[13]);

            this.participants.add(new Reindeer(name, speed, dashTime, restTime));
        });
    }
}
