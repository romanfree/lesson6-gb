package com.geekbrains;

public abstract class Animal {
    private String name;
    private int run;
    private int swim;

    public int getRun(){
        return run;
    }
    public void setRun(int run){
        this.run = run;
    }
    public int getSwim(){
        return swim;
    }
    public void setSwim(int swim){
        this.swim = swim;
    }
    public abstract void lengthRun(int speed);
    public abstract void lengthSwim(int speed);
}
