package com.AdventOfCode.Year_2015.Day_14;

public class Reindeer {
    private String name;
    private int speed;
    private int dashTime;
    private int restTime;
    private int score;

    public Reindeer(String name, int speed, int dashTime, int restTime)
    {
        this.name = name;
        this.speed = speed;
        this.dashTime = dashTime;
        this.restTime = restTime;
    }

    public Reindeer()
    {

    }

    public void award()
    {
        this.score += 1;
    }

    public int calculateDistance(int flyTimeSeconds)
    {
        int distance = 0;

        int completeIntervals = flyTimeSeconds / (this.dashTime + this.restTime);
        flyTimeSeconds -= completeIntervals * (this.dashTime + this.restTime);
        distance += completeIntervals * this.dashTime * this.speed;

        if (flyTimeSeconds < this.dashTime) distance += flyTimeSeconds * this.speed;
        else distance += this.dashTime * this.speed;

        return distance;
    }

    public int getScore()
    {
        return this.score;
    }
}
