package com.gndi.alertsapi.config;

import com.gndi.alertsapi.entities.*;
import com.gndi.alertsapi.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Locale;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private ContractRepository contractRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private BeneficiaryRepository beneficiaryRepository;

    @Autowired
    private AlertRepository alertRepository;

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);

        // LocalDate date1 = LocalDate.of(2022, Month.DECEMBER, 27);

        Provider provider1 = new Provider(null, 1107, 0, 1, null);
        Provider provider2 = new Provider(null, 157, 0, 14, null);
        providerRepository.saveAll(Arrays.asList(provider1, provider2));

        Contract contract1 = new Contract(null, "10013", 805362.67, 6309.70, 617699.65);
        contractRepository.saveAll(Arrays.asList(contract1));


        City city1 = new City(null, "ARAGUARI", "MG", "TRIANGULO");
        City city2 = new City(null, "UBERLANDIA", "MG", "TRIANGULO");
        cityRepository.saveAll(Arrays.asList(city1, city2));

        Beneficiary beneficiary1 = new Beneficiary(null, 1726875, "70022", 605.27, sdf.parse("2022/05/11 07:18:28"), 0, 0, 0, null, null, null);
        Beneficiary beneficiary2 = new Beneficiary(null, 1726878, "70037", 1010.50, sdf.parse("2022/05/11 07:18:28"), 0, 0, 0, null, null, null);
        beneficiaryRepository.saveAll(Arrays.asList(beneficiary1, beneficiary2));


        Alert alert1 = new Alert(null, 1, Instant.parse("2021-02-20T19:53:06Z"), city1, provider1, 34, 1, 2500.05, 0, null, null, null, 500.02, 0.0, 9452.25, contract1, null, null, null, null, null, null, null, null, null, null, null, null, beneficiary1);
        Alert alert2 = new Alert(null, 1, Instant.parse("2021-02-20T19:53:06Z"), city2, provider1, 34, 1, 2500.05, 0, null, null, null, null, null, null, contract1, null, null, null, null, null, null, null, null, null, null, null, null, beneficiary2);
        Alert alert3 = new Alert(null, 1, Instant.parse("2021-02-20T19:53:06Z"), city1, provider2, 34, 1, 2500.05, 0, null, null, null, null, null, null, contract1, null, null, null, null, null, null, null, null, null, null, null, null, beneficiary1);

        beneficiaryRepository.saveAll(Arrays.asList(beneficiary1, beneficiary2));
        alertRepository.saveAll(Arrays.asList(alert1, alert2, alert3));
    }
}
