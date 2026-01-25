package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example16 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);
        System.out.println("PROTOTYPE creating the Bean"+vehicleServices1.hashCode());
        System.out.println("PROTOTYPE creating the Bean"+vehicleServices2.hashCode());

    }
}
