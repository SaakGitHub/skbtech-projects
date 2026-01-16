package com.spring.config;

import com.spring.bean.Person;
import com.spring.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.spring.bean")
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Bean
    public Person person(Vehicle vehicle){
        var person = new Person();
        person.setName("John");
        person.setVehicle(vehicle());
        return person;
    }
}
