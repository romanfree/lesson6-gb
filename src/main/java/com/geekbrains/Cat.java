package com.geekbrains;

public class Cat extends Animal{

    @Override
    public void lengthRun(int speed){
        if(speed <= 200){
            System.out.println("Кот пробежал " + speed + "м");
        }else {
            System.out.println("Кот столько не пробежит");
        }
    }
    @Override
    public void lengthSwim(int speed) {
        System.out.println("кот не умеет плавать");
    }
}
