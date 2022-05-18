package com.gndi.alertsapi.config;

import com.gndi.alertsapi.entities.Alert;
import com.gndi.alertsapi.entities.Beneficiary;
import com.gndi.alertsapi.entities.City;
import com.gndi.alertsapi.entities.Provider;
import com.gndi.alertsapi.repositories.AlertRepository;
import com.gndi.alertsapi.repositories.BeneficiaryRepository;
import com.gndi.alertsapi.repositories.CityRepository;
import com.gndi.alertsapi.repositories.ProviderRepository;
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
    private ProviderRepository providerRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private BeneficiaryRepository beneficiaryRepository;

    @Autowired
    private AlertRepository alertRepository;

    @Override
    public void run(String... args) throws Exception {
        Provider provider1 = new Provider(null, 1107, 0, 1, Instant.parse("2021-02-20T19:53:06Z"));
        Provider provider2 = new Provider(null, 157, 0, 14, Instant.parse("2021-02-20T19:53:06Z"));
        providerRepository.saveAll(Arrays.asList(provider1, provider2));

        City city1 = new City(null, "ARAGUARI", "MG", "TRIANGULO");
        City city2 = new City(null, "UBERLANDIA", "MG", "TRIANGULO");
        cityRepository.saveAll(Arrays.asList(city1, city2));

        Beneficiary beneficiary1 = new Beneficiary(null, 1726875, "70022", 605.27, sdf.parse("2022/05/11 07:18:28"), 0, 0, 0, null, null, null);
        Beneficiary beneficiary2 = new Beneficiary(null, 1726878, "70037", 1010.50, sdf.parse("2022/05/11 07:18:28"), 0, 0, 0, null, null, null);
        beneficiaryRepository.saveAll(Arrays.asList(beneficiary1, beneficiary2));


        Alert alert1 = new Alert(null, 1, Instant.parse("2021-02-20T19:53:06Z"), city1, provider1, 34, 1, 2500.05, 0, null, null, null, 500.02, 0.0, 9452.25, null, null, null, null, null, null, null, null, null, null, null, null, null, beneficiary1);
        Alert alert2 = new Alert(null, 1, Instant.parse("2021-02-20T19:53:06Z"), city2, provider1, 34, 1, 2500.05, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, beneficiary2);
        Alert alert3 = new Alert(null, 1, Instant.parse("2021-02-20T19:53:06Z"), city1, provider2, 34, 1, 2500.05, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, beneficiary1);

        beneficiaryRepository.saveAll(Arrays.asList(beneficiary1, beneficiary2));
        alertRepository.saveAll(Arrays.asList(alert1, alert2, alert3));
    }
}
