package com.company;

public class Animal {
    final String species = "dog";
    String name;
    String race;
    private Double weight = 15.0;

//
    Double getWeight() {
        return weight;
    }

    void feed(Double foodWeight){
        if (weight <= 0){
            System.out.println("to late - animal is dead");
        } else{
            weight += foodWeight;
            System.out.println("You are the best. My weight is now " + weight);
        }
    }

    void takeForAWalk(Double foodWeight) {
        if (weight <= 0) {
            System.out.println("to late - animal is dead");
        } else {
            weight -= foodWeight;
            System.out.println("I am tired but My weight is now " + weight);
        }
}
}
