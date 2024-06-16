package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MusicalInstrumentsDto {
	private Boolean sound;
	private Boolean stringAvailability;
	private String type;
}
