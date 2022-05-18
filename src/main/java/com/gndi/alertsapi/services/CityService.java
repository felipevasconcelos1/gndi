package com.gndi.alertsapi.services;

import com.gndi.alertsapi.entities.City;
import com.gndi.alertsapi.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository repository;

    public List<City> findAll() {
        return repository.findAll();
    }

    public City findbyId(Integer id) {
        Optional<City> object = repository.findById(id);
        return object.get(); 
    }
}
