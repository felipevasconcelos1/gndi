package com.gndi.alertsapi.services;

import com.gndi.alertsapi.entities.DmProvider;
import com.gndi.alertsapi.repositories.DmProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DmProviderService {

    @Autowired
    private DmProviderRepository repository;

    public List<DmProvider> findAll() {
        return repository.findAll();
    }

    public DmProvider findbyId(Integer id) {
        Optional<DmProvider> object = repository.findById(id);
        return object.get(); 
    }
}
