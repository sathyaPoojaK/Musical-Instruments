package com.example.demo.controller;

import com.example.demo.dto.GuitarDto;
import com.example.demo.service.BassGuitarImpl;
import com.example.demo.service.ElectricGuitarImpl;
import com.example.demo.service.RockStarGuitarImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.InvalidNameException;

@RestController
@Slf4j
@RequestMapping("/guitar")
public class GuitarController {

    // injecting bean
//    private final RockStarGuitarImpl rockStarGuitarImpl;
//    private final BassGuitarImpl bassGuitarImpl;
    private final ElectricGuitarImpl electricGuitarImpl;

    GuitarController(ElectricGuitarImpl electricGuitarImpl){
        this.electricGuitarImpl = electricGuitarImpl;
    }
//    GuitarController(RockStarGuitarImpl rockStarGuitarImpl, BassGuitarImpl bassGuitarImpl, ElectricGuitarImpl electricGuitarImpl){
//        this.rockStarGuitarImpl = rockStarGuitarImpl;
//        this.bassGuitarImpl = bassGuitarImpl;
//        this.electricGuitarImpl = electricGuitarImpl;
//    }



//    @PostMapping("/addGuitar")
//    public ResponseEntity<String> addGuitars(@RequestBody GuitarDto guitarDto) throws InvalidNameException {
//        log.info("Entered into Guitar Controller :: addGuitars method");
//        return new ResponseEntity<>(GuitarService.getRockStarGuitar(guitarDto.getName()), HttpStatus.OK);
//    }

    @GetMapping("/getGuitar")
    public ResponseEntity<String> addGuitars(@RequestBody GuitarDto guitarDto) throws InvalidNameException {
        log.info("Entered into Guitar Controller :: getGuitars method");
//        return new ResponseEntity<>(guitarServiceImpl.getGuitarName(guitarDto.getName()), HttpStatus.OK);
        return new ResponseEntity<>(electricGuitarImpl.getGuitarType(guitarDto.getType()), HttpStatus.OK);
    }




}
