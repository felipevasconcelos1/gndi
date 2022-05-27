package com.gndi.alertsapi.services;

import com.gndi.alertsapi.entities.DmContract;
import com.gndi.alertsapi.repositories.DmContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DmContractService {

    @Autowired
    private DmContractRepository repository;

    public List<DmContract> findAll() {
        return repository.findAll();
    }

    public DmContract findbyId(Integer id) {
        Optional<DmContract> object = repository.findById(id);
        return object.get(); 
    }
}
