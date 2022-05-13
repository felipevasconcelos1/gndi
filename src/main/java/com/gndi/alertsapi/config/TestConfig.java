package com.gndi.alertsapi.config;

import com.gndi.alertsapi.entities.Beneficiary;
import com.gndi.alertsapi.repositories.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Autowired
    private BeneficiaryRepository beneficiaryRepository;

    @Override
    public void run(String... args) throws Exception {
        Beneficiary beneficiary = new Beneficiary(null, 1726875, "70022", 605.27, sdf.parse("2022/05/11 07:18:28"), 0, 0, 0, null, null, null);
        Beneficiary beneficiary2 = new Beneficiary(null, 1726878, "70037", 1010.50, sdf.parse("2022/05/11 07:18:28"), 0, 0, 0, null, null, null);

        beneficiaryRepository.saveAll(Arrays.asList(beneficiary, beneficiary2));
    }
}
