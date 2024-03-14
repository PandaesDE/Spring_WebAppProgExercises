package com.AdventOfCode;

public abstract class AOCExercise {
    protected String input = "no input set";

    public void setInput(String input) {
        this.input = input;
    }
    public abstract String answer1();
    public abstract String answer2();
}
