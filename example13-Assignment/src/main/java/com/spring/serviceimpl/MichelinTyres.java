package com.spring.serviceimpl;

import com.spring.service.Tyres;

public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {

        return "Car start moving using Michelin Tyres";
    }
}
