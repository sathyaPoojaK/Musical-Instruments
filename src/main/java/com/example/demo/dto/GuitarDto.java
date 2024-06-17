package com.example.demo.dto;

import com.example.demo.enums.GuitarType;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GuitarDto extends MusicalInstrumentsDto {
	@NotNull
	private GuitarType guitarType;
}
