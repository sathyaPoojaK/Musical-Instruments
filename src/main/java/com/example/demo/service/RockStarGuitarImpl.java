package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("rockStarGuitarImpl")
public class RockStarGuitarImpl implements GuitarService {

    @Override
    public String getGuitarInfo(){
        return "This is  RockStar guitar";
    }
    @Override
    public String addGuitarInfo(){
        return "The Rockstar guitar info is added!";
    }
    @Override
    public String updateGuitarInfo(){
        return "The Rockstar guitar info is updated!";
    }
    @Override
    public String deleteGuitarInfo(){
        return "The Rockstar guitar info is deleted!";
    }

}
