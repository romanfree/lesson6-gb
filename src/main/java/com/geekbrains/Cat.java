package com.geekbrains;

public class Cat extends Animal{
    static int run = 200;
    static int swim = 0;

    public Cat(String name){
        super(name, run, swim);
    }

    @Override
    public void swimAnimal(int swimLength) {
        System.out.println("кот не умеет плавать");
    }
}
