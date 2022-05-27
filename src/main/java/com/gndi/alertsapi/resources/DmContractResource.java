package com.gndi.alertsapi.resources;

import com.gndi.alertsapi.entities.DmContract;
import com.gndi.alertsapi.services.DmContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/dm_contracts")
public class DmContractResource {


    @Autowired
    private DmContractService service;

    @GetMapping
    public ResponseEntity<List<DmContract>> findAll() {
        List<DmContract> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<DmContract> findById(@PathVariable Integer id) {
        DmContract object = service.findbyId(id);
        return ResponseEntity.ok().body(object);
    }
}
