package com.gndi.alertsapi.resources;

import com.gndi.alertsapi.entities.Provider;
import com.gndi.alertsapi.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/providers")
public class ProviderResource {


    @Autowired
    private ProviderService service;

    @GetMapping
    public ResponseEntity<List<Provider>> findAll() {
        List<Provider> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Provider> findById(@PathVariable Integer id) {
        Provider object = service.findbyId(id);
        return ResponseEntity.ok().body(object);
    }
}
