package com.example.MuskHaveCars.Repository;

import com.example.MuskHaveCars.Classes.CarLocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarLocationRepository extends CrudRepository<CarLocation, Long> {
}
