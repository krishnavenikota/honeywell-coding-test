package com.honeywell.maps.services;

import com.honeywell.maps.pojos.City;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class MapsService implements MapServiceImpl {


    @Override
    public List<City> getAllCities() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<City>> response = restTemplate.exchange(
                "https://gist.githubusercontent.com/dastagirkhan/00a6f6e32425e0944241/raw/33ca4e2b19695b2b93f490848314268ed5519894/gistfile1.json",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                }
        );

        List<City> cities = response.getBody();
        return cities;
    }


}
