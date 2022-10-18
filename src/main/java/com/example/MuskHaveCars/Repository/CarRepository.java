package com.example.MuskHaveCars.Repository;

import com.example.MuskHaveCars.Classes.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    @Query(value = "select * from car order by car_name", nativeQuery = true)
    List<Car> sortByName();
/*
    @Query(value = "select * from car order by range desc", nativeQuery = true)
    List<Car> sortByRange();
*/

}
