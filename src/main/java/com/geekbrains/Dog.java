package com.geekbrains;

public class Dog extends Animal {
    private static int run = 500;
    private static int swim = 10;

    public Dog(String name){
        super(name, run, swim);
    }
}
