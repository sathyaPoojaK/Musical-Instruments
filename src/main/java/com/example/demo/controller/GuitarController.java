package com.example.demo.controller;

import com.example.demo.dto.GuitarDto;
import com.example.demo.service.GuitarService;
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
@RequestMapping("/guitar")
public class GuitarController {

    // injecting bean
    private final GuitarService guitarService;
    GuitarController(GuitarService guitarService){
        this.guitarService = guitarService;
    }

    @PostMapping("/addGuitar")
    public ResponseEntity<String> addGuitars(@RequestBody GuitarDto guitarDto) throws InvalidNameException {
        log.info("Entered into Guitar Controller :: addGuitars method");
        return new ResponseEntity<>(GuitarService.addGuitars(guitarDto), HttpStatus.OK);
    }

}
