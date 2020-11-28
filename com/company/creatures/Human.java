package com.company.creatures;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Human extends Animal {
    public String firstName;
    public String lastName;
    String city;
    Double idNumber;
    private Double salary;
    public Phone phone;
    private Car car;
    private Double cash;
//    public Human(String species) {
//        super(species);
//    }
//    odniesienie do final String species

    public Human(String firstName, String lastName) {
        super("homo sapiens");
        this.cash = 0.0;
        this.salary = 0.0;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Double getSalary() {
        DateTimeFormatter wtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("czas pobierania wypaty " + wtf.format(LocalDateTime.now()));
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("wypłata nie moze byc ujemna");

        } else {
            System.out.println("podpisano aneks do umowy " );
            System.out.println("wysłano aneks do HR");
            System.out.println("przesłano informacje do zus i us");
            this.salary = salary;
        }
    }




    public void setCar(Car car) {
        if(this.salary> car.value){
            System.out.println("GRATULUJE");
            this.car = car;
        }else if(this.salary > car.value/12.0){
            System.out.println("kupiłes auto na raty");
            this.car = car;
        } else {
            System.out.println("brak pieniędzy");
        }
}


    public Car getCar() {
        return car;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        if (cash != null) {
            this.cash = cash;
        } else {
            System.out.println("nie można mieć nieznaną liczbę gotówki");
        }

    }
}

