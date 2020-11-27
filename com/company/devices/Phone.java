package com.company.devices;

public class Phone {
    final public String producer;
    final public String model;
    public Double screenSize;

    public Phone(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }
    public String toString(){
        return this.producer + " " + this.model + " " + screenSize;
    }
}
