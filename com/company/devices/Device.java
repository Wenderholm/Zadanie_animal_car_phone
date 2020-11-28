package com.company.devices;

public abstract class Device  {
    final public String model;
    final public String producer;

    public Device(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }
    public abstract void turnOn();
}
