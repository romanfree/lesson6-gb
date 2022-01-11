package com.geekbrains;

public class Dog extends Animal {
    static int run = 500;
    static int swim = 10;

    public Dog(String name){
        super(name, run, swim);
    }
}
