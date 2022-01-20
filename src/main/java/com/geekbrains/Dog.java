package com.geekbrains;

public class Dog extends Animal {

    @Override
    public void lengthRun(int speed){
        if(speed <= 500){
            System.out.println("Собака пробежала " + speed + "м");
        }else {
            System.out.println("Собака столько не пробежит");
        }
    }
    @Override
    public void lengthSwim(int speed) {
        if(speed <= 10){
            System.out.println("Собака проплыла " + speed + "м");
        }else {
            System.out.println("Собака столько не проплывет");
        }
    }
}
