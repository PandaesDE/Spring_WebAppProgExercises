package com.AdventOfCode;

public abstract class AOCExercise {
    protected String input;
    protected String[] args;

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() { return this.input;}

    public void setArgs(String[] args) {
        this.args = args;
    }

    public String[] getArgs() { return this.args;}

    public abstract String answer1();
    public abstract String answer2();
}
