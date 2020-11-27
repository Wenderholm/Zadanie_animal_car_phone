package com.company;

public class Main {

    public static void main(String[] args) {
//        Animal dog = new Animal("dog");
//        dog.name = "azor";
////        do wartości private z klasy Animal
//        System.out.println("początkowa waga psa " + dog.getWeight());
//        System.out.println(dog.name);
//
//
//

        Human ja = new Human();
//        ja.firstName = "Przemek";
//        ja.lastName = "wenderholm";
//       wczytanie danych do human zeby nie bylo puste
//        ja.auto = mercedes;
//        System.out.println(ja.auto.model);
//        System.out.println("moje imie to " + ja.firstName + " moje nazwisko to " + ja.lastName + " posiadam pojazd " + ja.auto.producer);

//        System.out.println(ja.getSalary());
//        ja.setSalary(30000.0);
//        System.out.println(ja.getSalary());
        ja.setSalary(5000.0);
        Car opel = new Car("astra", "opel",12.0,7500.0);
        ja.setCar(opel);
        System.out.println(ja.getCar());
    }
}
