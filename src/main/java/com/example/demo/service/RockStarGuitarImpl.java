package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("rockStarGuitarImpl")
public class RockStarGuitarImpl implements GuitarService {


    @Override
    public String getGuitarInfo(){
        return "This is  RockStar guitar";
    }

}
