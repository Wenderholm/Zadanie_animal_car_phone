package com.company.devices;

public class Phone extends Device {
    public final Double screenSize;

    public Phone(String producer, String model, Double screenSize) {
        super(producer, model);
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
    //    inny sposób zapisywania toString
//    public String toString(){
//        return producer+" "+model+" "+screenSize;
//    }

//ta czesc jest uzywana do abstract w class Device
    @Override
    public void turnOn() {
        System.out.println("you pushed the button");
        System.out.println("black screen");
        System.out.println("black screen");
        System.out.println("black screen");
        System.out.println("beeep");
        System.out.println("helou");
        System.out.println("producer logo");
    }

}
