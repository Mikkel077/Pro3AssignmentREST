package com.pro3assignmentrest.service;

import com.pro3assignmentrest.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface IAnimalService extends JpaRepository<Animal, Long> {
    public List<Animal> findByDate(LocalDate dateOfArrival);
    public List<Animal> findByOrigin(String animalOrigin);
}
