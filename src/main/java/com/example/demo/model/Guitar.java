package com.example.demo.model;

import com.example.demo.enums.GuitarType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "guitars")
@Data
public class Guitar {
    @Id
    private String name;
    private Boolean sound;
    private Boolean stringAvailability;
    private GuitarType guitarType;
}
