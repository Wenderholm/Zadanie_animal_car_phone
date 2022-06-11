package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device implements Saleable {
    public final Double screenSize;

    public Phone(String model, String producer, Double screenSize) {
        super(model, producer);
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }


//ta czesc jest uzywana do abstract w class Device
    @Override
    public void turnOn() {
        System.out.println("you pushed the button");
        System.out.println("black screen");
        System.out.println("black screen");
        System.out.println("black screen");
        System.out.println("signal");
        System.out.println("hello");
        System.out.println("producer logo");
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getCash() == null || buyer.getCash() == null) {
            throw new Exception("Musisz zdefiniować stan portfela ");
        }
        if (seller.phone == null) {
            System.out.println("Sorry nie masz telefonu");
            throw new Exception("Brak telefonu");
        }
        if (buyer.getCash() < price){
            System.out.println("sorry nie masz kasy");
            throw new Exception("brak pieniędzy");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        buyer.phone = seller.phone;
        seller.phone = null;
        System.out.println("telefon sprzedano za " + price + " od " + seller.firstName + " do " + buyer.firstName);
    }
}
