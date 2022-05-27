package com.gndi.alertsapi.services;

import com.gndi.alertsapi.entities.Beneficiary;
import com.gndi.alertsapi.repositories.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class BeneficiaryService {

    @Autowired
    private BeneficiaryRepository repository;

    public List<Beneficiary> findAll() {
        return repository.findAll();
    }

    public Beneficiary findbyId(Integer id) {
        Optional<Beneficiary> object = repository.findById(id);
        return object.get(); 
    }
}
