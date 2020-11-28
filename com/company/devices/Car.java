package com.company.devices;

public class Car extends Device {

    final public Double age;
    public Double value;


    public Car(String model, String producer, Double age, Double value) {
        super(model, producer);
        this.age = age;
        this.value = value;
    }

}
