package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        bobik.runAnimal(500);
        bobik.swimAnimal(10);

        Cat tom = new Cat("Том");
        tom.runAnimal(200);
        tom.swimAnimal(25);
    }
}
