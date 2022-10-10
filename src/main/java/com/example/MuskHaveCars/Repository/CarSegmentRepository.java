package com.example.MuskHaveCars.Repository;

import com.example.MuskHaveCars.Classes.CarSegment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarSegmentRepository extends CrudRepository<CarSegment, Long> {
}
