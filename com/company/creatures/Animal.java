package com.company.creatures;

public class Animal {
//    final String species = "dog";
    final String species;
    String name;
    String race;
    private Double weight = 15.0;

    public Animal(String species) {
        this.species = species;
    }

    //
    Double getWeight() {
        return weight;
    }
    void setWeight(Double newWeight){
        this.weight = newWeight;
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
