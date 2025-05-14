package com.location.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.location.entity.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long>{

}
