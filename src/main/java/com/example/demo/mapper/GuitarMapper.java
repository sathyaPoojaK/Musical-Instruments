package com.example.demo.mapper;

import com.example.demo.dto.GuitarDto;
import com.example.demo.model.Guitar;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GuitarMapper {
    GuitarDto toDto(Guitar guitar);

    Guitar toEntity(GuitarDto guitarDto);
}
