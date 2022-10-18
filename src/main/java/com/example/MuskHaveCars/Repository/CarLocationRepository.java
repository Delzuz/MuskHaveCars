package com.example.MuskHaveCars.Repository;

import com.example.MuskHaveCars.Classes.Car;
import com.example.MuskHaveCars.Classes.CarLocation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarLocationRepository extends CrudRepository<CarLocation, Long> {

    @Query(value = "SELECT car_id, quantity, car_name, description, range, car_segment_id FROM  CAR_LOCATION join car on CAR_LOCATION.car_id = car.id", nativeQuery = true)
    List<Car> sortByRange();

}
