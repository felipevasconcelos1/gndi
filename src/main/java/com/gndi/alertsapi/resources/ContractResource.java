package com.gndi.alertsapi.resources;

import com.gndi.alertsapi.entities.Contract;
import com.gndi.alertsapi.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contracts")
public class ContractResource {


    @Autowired
    private ContractService service;

    @GetMapping
    public ResponseEntity<List<Contract>> findAll() {
        List<Contract> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Contract> findById(@PathVariable Integer id) {
        Contract object = service.findbyId(id);
        return ResponseEntity.ok().body(object);
    }
}
