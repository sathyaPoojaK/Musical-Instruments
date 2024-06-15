package com.example.demo.service;

import com.example.demo.constants.MusicalInstrumentsConstants;
import com.example.demo.dto.GuitarDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GuitarService {
    public static String addGuitars(GuitarDto guitarDto) {
        return guitarDto.getName();
//        return MusicalInstrumentsConstants.RESULT;
    }
}
