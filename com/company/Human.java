package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Human {
    String firstName;
    String lastName;
    String city;
    Double idNumber;
    private Double salary;
    private Car car;


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
}

