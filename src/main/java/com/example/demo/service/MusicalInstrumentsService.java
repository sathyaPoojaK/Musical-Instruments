package com.example.demo.service;

import com.example.demo.constants.MusicalInstrumentsConstants;
import com.example.demo.dto.MusicalInstrumentsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MusicalInstrumentsService {
    public String addInstruments(MusicalInstrumentsDto musicalInstrumentsDto) {
        return MusicalInstrumentsConstants.RESULT;
    }
}
