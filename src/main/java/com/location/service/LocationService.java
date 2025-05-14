package com.location.service;

import java.util.List;

import com.location.entity.Location;

public interface LocationService {

    List<Location> getAllLocations();
    Location getLocationById(Long locationId);
    Location addLocation(Location location);
    Location updateLocation(Long locationId, Location location);
    String deleteLocation(Long locationId);

}
