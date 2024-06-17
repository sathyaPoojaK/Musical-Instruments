package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("bassGuitarImpl")
public class BassGuitarImpl implements GuitarService{

    @Override
    public String getGuitarInfo(){
        return "This is  Bass guitar";
    }
    @Override
    public String addGuitarInfo(){
        return "The Bass guitar info is added!";
    }
    @Override
    public String updateGuitarInfo(){
        return "The Bass guitar info is updated!";
    }
    @Override
    public String deleteGuitarInfo(){
        return "The Bass guitar info is deleted!";
    }

}
