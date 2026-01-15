package com.spring;
import com.spring.bean.Person;
import com.spring.bean.Vehicle;
import com.spring.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example09 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Name of the vehicle is "+vehicle.getName());
        System.out.println("name of the perosn is "+person.getName());
        System.out.println("Vehicle own by the person is :: "+person.getVehicle());
    }
}
