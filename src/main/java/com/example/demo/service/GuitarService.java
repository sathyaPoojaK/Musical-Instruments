package com.example.demo.service;


import com.example.demo.dto.GuitarDto;

import java.util.List;
import java.util.Optional;

public interface GuitarService {
//    String getGuitarInfo();
//
//    String addGuitarInfo();
//
//    String updateGuitarInfo();
//    String deleteGuitarInfo();

    List<GuitarDto>  getGuitarInfo();
    Optional<GuitarDto> getGuitarById(String name);
    GuitarDto saveGuitar(GuitarDto guitarDto);
    void deleteGuitar(String name);
    GuitarDto updateGuitar(String name, GuitarDto guitarDto);
}
