package com.gndi.alertsapi.resources;

import com.gndi.alertsapi.entities.Beneficiary;
import com.gndi.alertsapi.services.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping(value = "/beneficiaries")
public class BeneficiaryResource {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Autowired
    private BeneficiaryService service;

    @GetMapping
    public ResponseEntity<List<Beneficiary>> findAll() throws ParseException {
        List<Beneficiary> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Beneficiary> findById(@PathVariable Integer id) {
        Beneficiary object = service.findbyId(id);
        return ResponseEntity.ok().body(object);
    }
}
