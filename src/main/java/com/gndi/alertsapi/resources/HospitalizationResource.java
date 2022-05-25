package com.gndi.alertsapi.resources;

import com.gndi.alertsapi.entities.Hospitalization;
import com.gndi.alertsapi.services.HospitalizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/hospitalizations")
public class HospitalizationResource {


    @Autowired
    private HospitalizationService service;

    @GetMapping
    public ResponseEntity<List<Hospitalization>> findAll() {
        List<Hospitalization> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Hospitalization> findById(@PathVariable Integer id) {
        Hospitalization object = service.findbyId(id);
        return ResponseEntity.ok().body(object);
    }
}
