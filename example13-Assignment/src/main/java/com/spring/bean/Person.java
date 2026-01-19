package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class Person {

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person Bean has bean created by SpringContext");
        this.vehicle=vehicle;
    }

    private String name = "Ashok";

    private final Vehicle vehicle;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    //Autowired using setter method
   // @Autowired
   /* public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    } ------------>> when we make the feild final then we can't take setter mothod becouse of the final method we are not able to assign value to it.'
    */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
