package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("electricGuitarImpl")
public class ElectricGuitarImpl implements GuitarService {

	@Override
	public String getGuitarInfo() {
		return "This is  Electrical guitar";
	}
}
