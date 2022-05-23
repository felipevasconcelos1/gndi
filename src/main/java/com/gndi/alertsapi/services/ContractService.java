package com.gndi.alertsapi.services;

import com.gndi.alertsapi.entities.Contract;
import com.gndi.alertsapi.repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractService {

    @Autowired
    private ContractRepository repository;

    public List<Contract> findAll() {
        return repository.findAll();
    }

    public Contract findbyId(Integer id) {
        Optional<Contract> object = repository.findById(id);
        return object.get(); 
    }
}
