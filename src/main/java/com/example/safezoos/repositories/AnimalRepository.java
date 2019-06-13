package com.example.safezoos.repositories;

import com.example.safezoos.models.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
    Animal findByAnimaltypeEqualsIgnoreCase(String name);
}