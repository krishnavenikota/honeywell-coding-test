package com.honeywell.maps.controllers;


import com.honeywell.maps.pojos.City;
import com.honeywell.maps.services.MapsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/maps")
public class MapsController {
    @Autowired
    private MapsService mapsService;

    @GetMapping(value = "/cities")
    public List<City> getCities()
    {

        List<City> cities = mapsService.getAllCities();

        return cities;
    }


}


