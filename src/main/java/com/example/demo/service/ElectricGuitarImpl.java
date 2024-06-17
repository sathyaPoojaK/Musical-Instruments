package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("electricGuitarImpl")
public class ElectricGuitarImpl implements GuitarService {

	@Override
	public String getGuitarInfo() {
		return "This is  Electrical guitar";
	}
	@Override
	public String addGuitarInfo(){
		return "The Electrical guitar info is added!";
	}
	@Override
	public String updateGuitarInfo(){
		return "The Electrical guitar info is updated!";
	}
	@Override
	public String deleteGuitarInfo(){
		return "The Electrical guitar info is deleted!";
	}

}
