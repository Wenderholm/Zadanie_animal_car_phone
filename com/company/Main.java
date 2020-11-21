package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog;
        dog = new Animal();
        dog.name = "azor";
//        do wartości private z klasy Animal
        System.out.println("początkowa waga psa " + dog.getWeight());
        System.out.println(dog.name);

        dog.feed(2.0);
        dog.takeForAWalk(10.0);
        dog.takeForAWalk(0.5);
        dog.takeForAWalk(6.5);
        dog.takeForAWalk(1.0);
    }
}
