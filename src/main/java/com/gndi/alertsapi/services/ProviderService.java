package com.gndi.alertsapi.services;

import com.gndi.alertsapi.entities.Provider;
import com.gndi.alertsapi.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository repository;

    public List<Provider> findAll() {
        return repository.findAll();
    }

    public Provider findbyId(Integer id) {
        Optional<Provider> object = repository.findById(id);
        return object.get(); 
    }
}
