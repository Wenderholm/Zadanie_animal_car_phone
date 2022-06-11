package com.company.devices;

public class Car extends Device {

    final public Double age;
    public Double value;


    public Car(String model, String producer, Double age, Double value) {
        super(model, producer);
        this.age = age;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", value=" + value +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
    @Override
    public void turnOn() {
        System.out.println("key turned");
        System.out.println("not working");
        System.out.println("key turned");
        System.out.println("not working");
        System.out.println("key turned");
        System.out.println("engine started");
    }
}
