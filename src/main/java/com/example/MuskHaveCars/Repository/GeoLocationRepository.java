package com.example.MuskHaveCars.Repository;

import com.example.MuskHaveCars.Classes.GeoLocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoLocationRepository extends CrudRepository<GeoLocation, Long> {
}
