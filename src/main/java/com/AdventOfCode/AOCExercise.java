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
    public void setArg(String arg, int index)
    {
        if (this.args == null) this.args = new String[index + 1];
        if (this.args.length <= index) {
            String[] old = this.args;
            this.args = new String[index + 1];
            System.arraycopy(old, 0, this.args, 0, old.length);
        }
        this.args[index] = arg;
    }

    public String[] getArgs() { return this.args;}

    public abstract String answer1();
    public abstract String answer2();
}
