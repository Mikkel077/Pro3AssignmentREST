package com.pro3assignmentrest.controller;


import com.pro3assignmentrest.model.Animal;
import com.pro3assignmentrest.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/animals")
@RequiredArgsConstructor
public class AnimalController {
    private final AnimalService animalService;

    @GetMapping("{id}")
    public ResponseEntity<Optional<Animal>> getAnimalById(@PathVariable Long id) {
        Optional<Animal> animal = animalService.getAnimalById(id);
        if (animal.isPresent()) {
            return ResponseEntity.ok(animal);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals(@RequestParam(required = false)LocalDate dateOfArrival, @RequestParam(required = false)String animalOrigin) {
        return ResponseEntity.ok(animalService.getAllAnimals(dateOfArrival, animalOrigin));
    }

}