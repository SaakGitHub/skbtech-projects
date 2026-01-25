package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example15 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       // VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        System.out.println("Before creating the lazy instantiotion");
        Person person = context.getBean(Person.class);
        System.out.println("After creating the lazy instantiotion");

    }
}
