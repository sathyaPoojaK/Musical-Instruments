package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("bassGuitarImpl")
public class BassGuitarImpl implements GuitarService{

    @Override
    public String getGuitarInfo(){
        return "This is  Bass guitar";
    }
}
