package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Car opel = new Car("corsa","opel",20.0,500.0);

// dodanie dwóch osób
        Human ja = new Human("przemek","wenderholm");
        Human brother = new Human("paweł","wenderholm");
//        ustawienie 5000 zł dla brata
        brother.setCash(5000.0);
//        stworzenie telefonu
        Phone nokia = new Phone("nokia", "stara", 1.0);
//        dodanie telefonu nokia do ja
        ja.setPhone(nokia);

        try {
            nokia.sell(ja, brother, 50.0);
        } catch (Exception e) {
            System.out.println("sorry, nie udało się sprzedać");
            System.out.println(e.getMessage());
        }
        System.out.println("dalsza logika");

//      WYKORZYSTANIE KLASY ABSTRAKCYJNEJ
        nokia.turnOn();
        opel.turnOn();
//      sprawdzenie opisu wyplaty z czasem
        ja.getSalary();

//        sprawdzenie stanu konta
        System.out.println("Tyle posiada pieniędzy: "+ja.getCash());
// sprawdzenie czy mogę kupić za drogie auto opla
        ja.setCar(opel);
//        ustawienie pieniędzy uzytkownikowi
        ja.setCash(1000.0);
        System.out.println("Tyle posiada pieniędzy: " + ja.getCash());
        ja.setCar(opel);
        System.out.println("Tyle posiada pieniędzy: " + ja.getCash());

        System.out.println("********   Karmienie psa ******");
        Animal pies = new Animal("dog","azor","czworonogi");
        System.out.println(pies.getWeight());
        pies.feed(10.0);
        System.out.println(pies.getWeight());
        pies.takeForAWalk(5.0);
        System.out.println(pies.getWeight());
        pies.takeForAWalk(21.0);
    }


}
