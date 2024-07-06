package com.example.demo.repository;

import com.example.demo.dto.GuitarDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuitarRepository extends MongoRepository<GuitarDto, String> {
}
