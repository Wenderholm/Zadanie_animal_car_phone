package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "azor";
//        do wartości private z klasy Animal
        System.out.println("początkowa waga psa " + dog.getWeight());
        System.out.println(dog.name);

        dog.feed(2.0);
        dog.takeForAWalk(10.0);
        dog.takeForAWalk(0.5);
        dog.takeForAWalk(6.5);
        dog.takeForAWalk(1.0);

        Car mercedes = new Car("LS200","mercedes" );
//        przypisanie samochodu do czlowieka
        mercedes.age = 10.0;
//        System.out.println(mercedes.model);


        Human ja = new Human();
        ja.firstName = "Przemek";
        ja.lastName = "wenderholm";
//       wczytanie danych do human zeby nie bylo puste
        ja.auto = mercedes;
        System.out.println(ja.auto.model);
        System.out.println("moje imie to " + ja.firstName + " moje nazwisko to " + ja.lastName + " posiadam pojazd " + ja.auto.producer);
    }
}
