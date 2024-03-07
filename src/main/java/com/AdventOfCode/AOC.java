package com.AdventOfCode;

public abstract class AOC {
    protected final String input;

    public AOC(String input) {
        this.input = input;
    }

    public abstract String Answer1();
    public abstract String Answer2();
}
