package com.gndi.alertsapi.resources;

import com.gndi.alertsapi.entities.Alert;
import com.gndi.alertsapi.services.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/alerts")
public class AlertResource {


    @Autowired
    private AlertService service;

    @GetMapping
    public ResponseEntity<List<Alert>> findAll() {
        List<Alert> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Alert> findById(@PathVariable Integer id) {
        Alert object = service.findbyId(id);
        return ResponseEntity.ok().body(object);
    }


}
