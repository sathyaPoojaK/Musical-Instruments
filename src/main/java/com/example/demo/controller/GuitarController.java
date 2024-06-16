package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
