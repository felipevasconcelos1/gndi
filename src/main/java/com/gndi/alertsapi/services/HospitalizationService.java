package com.gndi.alertsapi.services;

import com.gndi.alertsapi.entities.Hospitalization;
import com.gndi.alertsapi.repositories.HospitalizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalizationService {

    @Autowired
    private HospitalizationRepository repository;

    public List<Hospitalization> findAll() {
        return repository.findAll();
    }

    public Hospitalization findbyId(Integer id) {
        Optional<Hospitalization> object = repository.findById(id);
        return object.get(); 
    }
}
