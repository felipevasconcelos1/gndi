package com.gndi.alertsapi.resources;

import com.gndi.alertsapi.entities.Beneficiary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping(value = "/beneficiaries")
public class BeneficiaryResource {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @GetMapping
    public ResponseEntity<Beneficiary> findAll() throws ParseException {
        Beneficiary beneficiary = new Beneficiary(39886097, 1726874, "70017", 592.01, sdf.parse("2022/05/11 07:18:28"), 0, 0, 0, null, null, null);
        return ResponseEntity.ok().body(beneficiary);
    }
}
