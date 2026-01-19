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
    public  Vehicle vehicle1(){
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return  vehicle;
    }
    @Bean
    @Primary
    public  Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("LEXUS");
        return  vehicle;
    }
    @Bean
    public  Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("Mitsbushi");
        return  vehicle;
    }


}
