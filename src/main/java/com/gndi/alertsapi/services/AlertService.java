package com.gndi.alertsapi.services;

import com.gndi.alertsapi.entities.Alert;
import com.gndi.alertsapi.entities.DmBeneficiary;
import com.gndi.alertsapi.repositories.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertService {

    @Autowired
    private AlertRepository repository;

    public List<Alert> findAll() {
        return repository.findAll();
    }

    public Alert findbyId(Integer id) {
        Optional<Alert> object = repository.findById(id);
        return object.get(); 
    }

    /*
    public List<Alert> findByBeneficiary(Integer beneficiaryId) {
        DmBeneficiary beneficiary = new DmBeneficiary();
        beneficiary.setId(beneficiaryId);
        return repository.findByBeneficary(beneficiary);
    }

     */
}
