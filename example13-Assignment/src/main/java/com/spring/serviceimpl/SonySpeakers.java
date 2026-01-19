package com.spring.serviceimpl;

import com.spring.service.Speakers;

public class SonySpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Sony Speakers Start to play music";
    }
}
