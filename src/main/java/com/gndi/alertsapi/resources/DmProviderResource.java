package com.gndi.alertsapi.resources;

import com.gndi.alertsapi.entities.DmProvider;
import com.gndi.alertsapi.services.DmProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/dm_providers")
public class DmProviderResource {

    @Autowired
    private DmProviderService service;

    @GetMapping
    public ResponseEntity<List<DmProvider>> findAll() {
        List<DmProvider> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<DmProvider> findById(@PathVariable Integer id) {
        DmProvider object = service.findbyId(id);
        return ResponseEntity.ok().body(object);
    }
}
