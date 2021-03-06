package com.gndi.alertsapi.services;

import com.gndi.alertsapi.entities.Alert;
import com.gndi.alertsapi.entities.Beneficiary;
import com.gndi.alertsapi.entities.DmBeneficiary;
import com.gndi.alertsapi.repositories.DmBeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class DmBeneficiaryService {

    @Autowired
    private DmBeneficiaryRepository repository;


    public List<DmBeneficiary> findAll() {
        return repository.findAll();
    }

    public DmBeneficiary findbyId(Integer id) {
        Optional<DmBeneficiary> object = repository.findById(id);
        return object.get();
    }

    public List<Alert> findAlertsByBeneficiaryId(Integer id) {
        Optional<DmBeneficiary> object = repository.findById(id);
        if (!object.isEmpty()){
            return object.get().getAlerts();
        }
        return Arrays.asList();
    }
}
