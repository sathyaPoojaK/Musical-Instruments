package com.example.demo.controller;

import com.example.demo.dto.MusicalInstrumentsDto;
import com.example.demo.service.MusicalInstrumentsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.InvalidNameException;

@RestController
@Slf4j
@RequestMapping("/instruments")
public class MusicalInstrumentsController {

    // injecting bean
    private final MusicalInstrumentsService musicalInstrumentsService;
    MusicalInstrumentsController(MusicalInstrumentsService musicalInstrumentsService) {
        this.musicalInstrumentsService = musicalInstrumentsService;
    }

    @PostMapping("/addInstrument")
    public ResponseEntity<String> addInstruments(@RequestBody MusicalInstrumentsDto musicalInstrumentsDto) throws InvalidNameException {
        log.info("Entered into MusicalInstruments Controller :: addInstruments method");
        return new ResponseEntity<>(musicalInstrumentsService.addInstruments(musicalInstrumentsDto), HttpStatus.OK);
    }


}
