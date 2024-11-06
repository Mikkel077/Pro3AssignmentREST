package com.pro3assignmentrest.service;


import com.pro3assignmentrest.model.Animal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnimalService {
        private final IAnimalService animalService;

        public Optional<Animal> getAnimalById(Long id) {
            return animalService.findById(id);
        }

        public List<Animal> getAllAnimals(LocalDate dateOfArrival, String animalOrigin) {
            if (dateOfArrival != null){
                return animalService.findByDate(dateOfArrival);
            }

            if (animalOrigin != null){
                return animalService.findByOrigin(animalOrigin);
            }

            return animalService.findAll();
        }
}
