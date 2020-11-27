package com.company.devices;

public class Car {
    final public String model;
    final public String producer;
    final public Double age;
    public Double value;


    public Car(String model, String producer, Double age, Double value) {
        this.model = model;
        this.producer = producer;
        this.age = age;
        this.value = value;
    }
    public String toString(){
        return this.model + " " + this.producer + " " + this.age + " jego cena wynosi " + this.value ;
    }
}
