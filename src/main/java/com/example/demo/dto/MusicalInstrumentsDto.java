package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MusicalInstrumentsDto {
    @NotBlank
    private Boolean sound;
    @NotBlank
    private Boolean stringAvailability;
    @NotNull
    private String type;
}
