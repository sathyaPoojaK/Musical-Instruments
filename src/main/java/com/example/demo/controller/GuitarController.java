package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.GuitarDto;
import com.example.demo.service.GuitarService;
import com.example.demo.service.GuitarServiceSelector;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/guitar")
public class GuitarController {
	// private final RockStarGuitarImpl rockStarGuitar;
	// private final ElectricGuitarImpl electricGuitar;
	// private final BassGuitarImpl bassGuitar;
	// GuitarController(RockStarGuitarImpl rockStarGuitar, ElectricGuitarImpl
	// electricGuitar, BassGuitarImpl bassGuitar) {
	// this.rockStarGuitar = rockStarGuitar;
	// this.electricGuitar = electricGuitar;
	// this.bassGuitar = bassGuitar;
	// }

	private final GuitarServiceSelector guitarServiceSelector;

	public GuitarController(GuitarServiceSelector guitarServiceSelector) {
		this.guitarServiceSelector = guitarServiceSelector;
	}

	@GetMapping("/get")
	public ResponseEntity<String> getGuitars(@RequestBody @Valid GuitarDto guitarDto) {
		log.info("Entered into Guitar Controller :: getGuitars method");
		GuitarService guitarService = guitarServiceSelector.selectService(guitarDto.getGuitarType());
		// switch (guitarDto.getGuitarType()) {
		// case ELECTRIC -> guitarService = electricGuitar;
		// case ROCKSTAR -> guitarService = rockStarGuitar;
		// default -> guitarService = bassGuitar;
		// }
		return new ResponseEntity<>(guitarService.getGuitarInfo(), HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<String> addGuitars(@RequestBody @Valid GuitarDto guitarDto){
		log.info("Entered into Guitar Controller :: addGuitars method");
		GuitarService guitarService = guitarServiceSelector.selectService(guitarDto.getGuitarType());
		return new ResponseEntity<>(guitarService.addGuitarInfo(), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateGuitars(@RequestBody @Valid GuitarDto guitarDto){
		log.info("Entered into Guitar Controller :: updateGuitars method");
		GuitarService guitarService = guitarServiceSelector.selectService(guitarDto.getGuitarType());
		return new ResponseEntity<>(guitarService.updateGuitarInfo(), HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteGuitars(@RequestBody @Valid GuitarDto guitarDto){
		log.info("Entered into Guitar Controller :: deleteGuitars method");
		GuitarService guitarService = guitarServiceSelector.selectService(guitarDto.getGuitarType());
		return new ResponseEntity<>(guitarService.deleteGuitarInfo(), HttpStatus.OK);
	}

}
