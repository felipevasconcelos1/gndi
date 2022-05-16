package com.gndi.alertsapi.config;

import com.gndi.alertsapi.entities.Alert;
import com.gndi.alertsapi.entities.Beneficiary;
import com.gndi.alertsapi.repositories.AlertRepository;
import com.gndi.alertsapi.repositories.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Autowired
    private BeneficiaryRepository beneficiaryRepository;

    @Autowired
    private AlertRepository alertRepository;

    @Override
    public void run(String... args) throws Exception {
        Beneficiary beneficiary1 = new Beneficiary(null, 1726875, "70022", 605.27, sdf.parse("2022/05/11 07:18:28"), 0, 0, 0, null, null, null);
        Beneficiary beneficiary2 = new Beneficiary(null, 1726878, "70037", 1010.50, sdf.parse("2022/05/11 07:18:28"), 0, 0, 0, null, null, null);
        beneficiaryRepository.saveAll(Arrays.asList(beneficiary1, beneficiary2));


        Alert alert1 = new Alert(null, 1, Instant.parse("2021-02-20T19:53:06Z"), 1, 1, 34, 1, 2500.05, 0, null, null, Instant.parse("2020-12-20T19:53:06Z"), 500.02, 0.0, 9452.25, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Alert alert2 = new Alert(null, 1, Instant.parse("2021-02-20T19:53:06Z"), 1, 1, 34, 1, 2500.05, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Alert alert3 = new Alert(null, 1, Instant.parse("2021-02-20T19:53:06Z"), 1, 1, 34, 1, 2500.05, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

        beneficiaryRepository.saveAll(Arrays.asList(beneficiary1, beneficiary2));
        alertRepository.saveAll(Arrays.asList(alert1, alert2, alert3));
    }
}
