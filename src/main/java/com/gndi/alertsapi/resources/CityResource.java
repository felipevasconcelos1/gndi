package com.gndi.alertsapi.resources;

import com.gndi.alertsapi.entities.City;
import com.gndi.alertsapi.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cities")
public class CityResource {


    @Autowired
    private CityService service;

    @GetMapping
    public ResponseEntity<List<City>> findAll() {
        List<City> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<City> findById(@PathVariable Integer id) {
        City object = service.findbyId(id);
        return ResponseEntity.ok().body(object);
    }
}
