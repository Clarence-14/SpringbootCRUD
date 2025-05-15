package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entity.Location;
import com.location.service.LocationService;



@RestController
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;
    
    @GetMapping("/locations")
    public ResponseEntity<List<Location>> getAllLocations() {
        return ResponseEntity.ok(locationService.getAllLocations());
    }

     @GetMapping("/locations/locationId")
    public ResponseEntity<Location> getLocationById(@PathVariable("locationId") Long locationId) {
        return ResponseEntity.ok(locationService.getLocationById(locationId));
    }
    
    @PostMapping("/locations")
    public ResponseEntity<Location> addLocation(@RequestBody Location location) {
        
        return ResponseEntity.ok(locationService.addLocation(location));
    }
    
    @PatchMapping("/locations/locationId")
    public ResponseEntity<Location> updateLocation(@PathVariable("locationId") Long locationId, @RequestBody Location location) {
        return ResponseEntity.ok(locationService.updateLocation(locationId, location));
    }

    @DeleteMapping("/locations/locationId")
    public ResponseEntity<String> deleteLocation(@PathVariable("locationId") Long locationId) {
        return ResponseEntity.ok(locationService.deleteLocation(locationId));
    }

}
