package com.example.MuskHaveCars.Repository;

import com.example.MuskHaveCars.Classes.Rental;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends CrudRepository<Rental, Long> {
}
