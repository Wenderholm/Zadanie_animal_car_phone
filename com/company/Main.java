package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

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

        Human ja = new Human("przemek","wenderholm");
        Human brother = new Human("paweł","wenderholm");
        brother.setCash(5000.0);
//        ja.firstName = "Przemek";
//        ja.lastName = "wenderholm";
//       wczytanie danych do human zeby nie bylo puste
//        ja.auto = mercedes;
//        System.out.println(ja.auto.model);
//        System.out.println("moje imie to " + ja.firstName + " moje nazwisko to " + ja.lastName + " posiadam pojazd " + ja.auto.producer);

//        System.out.println(ja.getSalary());
//        ja.setSalary(30000.0);
//        System.out.println(ja.getSalary());
//        ja.setSalary(5000.0);
//        Car opel = new Car("astra", "opel",12.0,7500.0);
//        ja.setCar(opel);
//        System.out.println(ja.getCar());
//        Phone nokia = new Phone("nokia","aaaa");
//        nokia.screenSize = 360.00;
//        System.out.println(nokia);
//        System.out.println(ja instanceof Human);
//        System.out.println(ja instanceof Animal);



        Phone nokia = new Phone("nokia", "stara", 1.0);
        Car opel = new Car("corsa","opel",20.0,5500.0);
//        opel.sell();
//        System.out.println(opel);
//        System.out.println(nokia);
//        System.out.println(opel);
        try {
            nokia.sell(ja, brother, 50.0);
        } catch (Exception e) {
            System.out.println("sorry, nie udało się sprzedać");
            System.out.println(e.getMessage());
        }
        System.out.println("dalsza logika");
    }
}
