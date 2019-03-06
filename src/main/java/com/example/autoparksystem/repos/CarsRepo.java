package com.example.autoparksystem.repos;

import com.example.autoparksystem.model.Cars;
import org.springframework.data.repository.CrudRepository;

public interface CarsRepo extends CrudRepository<Cars, Integer> {
}
