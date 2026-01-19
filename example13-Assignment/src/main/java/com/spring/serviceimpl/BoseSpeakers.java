package com.spring.serviceimpl;

import com.spring.service.Speakers;

public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Bose speaker starts to play Music";
    }
}
