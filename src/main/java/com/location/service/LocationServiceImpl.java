package com.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.location.entity.Location;
import com.location.repository.LocationRepository;

public class LocationServiceImpl implements LocationService {

    // Assuming you have a LocationRepository injected here
     @Autowired
     private LocationRepository locationRepository;

    @Override
    public List<Location> getAllLocations() {
     return (List<Location>) locationRepository.findAll();
     
    }

    @Override
    public Location getLocationById(Long locationId) {
     return locationRepository.findById(locationId).get();
        
    }

    @Override
    public Location addLocation(Location location) {
     return locationRepository.save(location);
        
    }

    @Override
    public Location updateLocation(Long locationId, Location location) {
        // return locationRepository.save(location);
        Location locationobj = locationRepository.findById(locationId).get();
        if (locationobj != null) {
            locationobj.setStreet(location.getStreet());
            locationobj.setCity(location.getCity());
            locationobj.setState(location.getState());
        }
     return locationRepository.save(location);
    }

    @Override
    public String deleteLocation(Long locationId) {
        Location locationobj = locationRepository.findById(locationId).get();
        if(locationobj != null) { 
            locationRepository.delete(locationobj);
        } 
        return "Location deleted successfully for id: " + locationId;
        
        
    }

  

}
