package com.geekbrains;

public class Animal {
    public String name;
    public int run;
    public int swim;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public void runAnimal(int runLength){
        System.out.println(name + " " + "пробежал(а) " + run + "м ");
    }
    public void swimAnimal(int swimLength){
        System.out.println(name + " " + "проплыл(а) " + swim + "м ");
    }
}
