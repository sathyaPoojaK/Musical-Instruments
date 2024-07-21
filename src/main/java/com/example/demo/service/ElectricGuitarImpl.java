package com.example.demo.service;

import com.example.demo.dto.GuitarDto;
import com.example.demo.repository.GuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("electricGuitarImpl")
public class ElectricGuitarImpl implements GuitarService {

	@Autowired
	private GuitarRepository guitarRepository;

	@Override
	public List<GuitarDto> getGuitarInfo(){
		return guitarRepository.findAll();
	}
	@Override
	public Optional<GuitarDto> getGuitarById(String name){
		return guitarRepository.findById(name);
	}
	@Override
	public GuitarDto saveGuitar(GuitarDto guitarDto){
		return guitarRepository.save(guitarDto);
	}
	@Override
	public void deleteGuitar(String name) {
		guitarRepository.deleteById(name);
	}

	@Override
	public GuitarDto updateGuitar(String name, GuitarDto guitarDto) {
		if (guitarRepository.existsById(name)){
			guitarDto.setName(name);
			return guitarRepository.save(guitarDto);
		}else{
			throw new IllegalArgumentException("Guitar with name " +name+ " not found!!!");
		}
	}


//	@Override
//	public String getGuitarInfo() {
//		return "This is  Electrical guitar";
//	}
//	@Override
//	public String addGuitarInfo(){
//		return "The Electrical guitar info is added!";
//	}
//	@Override
//	public String updateGuitarInfo(){
//		return "The Electrical guitar info is updated!";
//	}
//	@Override
//	public String deleteGuitarInfo(){
//		return "The Electrical guitar info is deleted!";
//	}

}
