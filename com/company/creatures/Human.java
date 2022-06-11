package com.company.creatures;
import com.company.devices.Phone;
import com.company.devices.Car;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Human extends Animal {
    public String firstName;
    public String lastName;
    private Double salary;
    public Phone phone;
    private Car car;
    private Double cash;

    public Human(String firstName, String lastName) {
        super("homo sapiens");
        this.cash = 0.0;
        this.salary = 0.0;
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    pobieranie i dodawnie wypłaty dla człowieka

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


    public void setPhone(Phone phone){
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setCar(Car car) {
        if(this.cash> car.value){
            System.out.println("GRATULUJE kupiłeś auto za " + car.value + " zł");
            this.car = car;
            this.cash -= car.value;
        }else if(this.cash > car.value/12.0){
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

