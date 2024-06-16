package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class RockStarGuitarImpl implements GuitarService {
    @Override
    public String getGuitarName(String name){
        return "This is " + name + "!";
    }

    @Override
    public String getGuitarType(String type){
        return "This is " + type + " RockStar guitar";
    }

}
