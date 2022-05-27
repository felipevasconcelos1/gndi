package com.gndi.alertsapi.resources;

import com.gndi.alertsapi.entities.Beneficiary;
import com.gndi.alertsapi.entities.DmBeneficiary;
import com.gndi.alertsapi.services.DmBeneficiaryService;
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
@RequestMapping(value = "/dm_beneficiaries")
public class DmBeneficiaryResource {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Autowired
    private DmBeneficiaryService service;

    @GetMapping
    public ResponseEntity<List<DmBeneficiary>> findAll() throws ParseException {
        List<DmBeneficiary> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<DmBeneficiary> findById(@PathVariable Integer id) {
        DmBeneficiary object = service.findbyId(id);
        return ResponseEntity.ok().body(object);
    }
}
