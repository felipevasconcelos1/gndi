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
    private DmBeneficiaryRepository dmBeneficiaryRepository;

    @Autowired
    private DmProviderRepository dmProviderRepository;

    @Autowired
    private DmContractRepository dmContractRepository;

    @Autowired
    private HospitalizationRepository hospitalizationRepository;

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

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);

        DmContract dmContract1 = new DmContract("164673", null, null);
        DmContract dmContract2 = new DmContract("9276", null, null);
        DmContract dmContract3 = new DmContract("10034", null, null);
        dmContractRepository.saveAll(Arrays.asList(dmContract1,dmContract2,dmContract3));

        DmProvider dmProvider1 = new DmProvider(null, "Fernando de Cavalho Azevedo", null);
        DmProvider dmProvider2 = new DmProvider(null, "Ivo Fernandes Rocha", null);
        dmProviderRepository.saveAll(Arrays.asList(dmProvider1, dmProvider2));

        Provider provider1 = new Provider(null, dmProvider1, 0, 1, null);
        Provider provider2 = new Provider(null, dmProvider2, 0, 14, null);
        providerRepository.saveAll(Arrays.asList(provider1, provider2));

        Contract contract1 = new Contract(null, dmContract1, 805362.67, 6309.70, 617699.65);
        contractRepository.saveAll(Arrays.asList(contract1));

        City city1 = new City(null, "ARAGUARI", "MG", "TRIANGULO");
        City city2 = new City(null, "UBERLANDIA", "MG", "TRIANGULO");
        cityRepository.saveAll(Arrays.asList(city1, city2));

        DmBeneficiary dm_beneficary1 = new DmBeneficiary(null, 32, "Someone who I gave name to");
        DmBeneficiary dm_beneficary2 = new DmBeneficiary(null, 32, "Someone different who I gave name to");
        dmBeneficiaryRepository.saveAll(Arrays.asList(dm_beneficary1, dm_beneficary2));

        Beneficiary ft_beneficiary1 = new Beneficiary(null, dm_beneficary1,dmContract1, 605.27, sdf.parse("2022/05/11 07:18:28"), 0, 0, 0, null, null, null);
        Beneficiary ft_beneficiary2 = new Beneficiary(null, dm_beneficary2,dmContract2, 1010.50, sdf.parse("2022/05/11 07:18:28"), 0, 0, 0, null, null, null);
        beneficiaryRepository.saveAll(Arrays.asList(ft_beneficiary1, ft_beneficiary2));

        LocalDate creationDate1 = LocalDate.of(2021, Month.NOVEMBER, 05);
        LocalDate creationDate2 = LocalDate.of(2021, Month.NOVEMBER, 06);
        LocalDate creationDate3 = LocalDate.of(2021, Month.NOVEMBER, 07);
        LocalDate creationDate4 = LocalDate.of(2021, Month.NOVEMBER, 10);

        Hospitalization hospitalization1 = new Hospitalization(null, dm_beneficary1, dmContract1, null, null, city1, dmProvider1, null, null, null);
        Hospitalization hospitalization2 = new Hospitalization(null, dm_beneficary2, dmContract2, null, null, city2, dmProvider2, null, null, null);
        hospitalizationRepository.saveAll(Arrays.asList(hospitalization1, hospitalization2));

        LocalDate hospitalizationDate1 = LocalDate.of(2021, Month.NOVEMBER, 11);


        Alert alert1 = new Alert(null, 1, hospitalizationDate1, city1, dmProvider1, 34, 1, 2500.05, 0, null, null, null, 500.02, 0.0, 9452.25, dmContract1, null, null, null, null, null, null, null, creationDate1, null, null, null, null, dm_beneficary1);
        Alert alert2 = new Alert(null, 1, hospitalizationDate1, city2, dmProvider1, 34, 1, 2500.05, 0, null, null, null, null, null, null, dmContract1, null, null, null, null, null, null, null, creationDate2, null, null, null, null, dm_beneficary1);
        Alert alert3 = new Alert(null, 1, hospitalizationDate1, city1, dmProvider2, 34, 1, 2500.05, 0, null, null, null, null, null, null, dmContract1, null, null, null, null, null, null, null, creationDate3, null, null, null, null, dm_beneficary1);
        Alert alert4 = new Alert(null, 1, hospitalizationDate1, city1, dmProvider2, 34, 1, 2500.05, 0, null, null, null, null, null, null, dmContract1, null, null, null, null, null, null, null, creationDate4, null, null, null, null, dm_beneficary1);
        Alert alert5 = new Alert(null, 1, hospitalizationDate1, city1, dmProvider2, 34, 1, 2500.05, 0, null, null, null, null, null, null, dmContract2, null, null, null, null, null, null, null, creationDate1, null, null, null, null, dm_beneficary2);
        alertRepository.saveAll(Arrays.asList(alert1, alert2, alert3, alert4, alert5));

        Task task1 = new Task(null, alert1, alert1.getBeneficiary(), alert1.getHospitalizationDate(), alert1.getProvider());
        Task task2 = new Task(null, alert1, alert1.getBeneficiary(), alert1.getHospitalizationDate(), alert1.getProvider());
        Task task3 = new Task(null, alert1, alert1.getBeneficiary(), alert1.getHospitalizationDate(), alert1.getProvider());
        Task task4 = new Task(null, alert1, alert1.getBeneficiary(), alert1.getHospitalizationDate(), alert1.getProvider());
        Task task5 = new Task();
        task5.setAlert(alert2);
        task5.setBeneficiary(task5.getAlert().getBeneficiary());
        task5.setHospitalizationDate(task5.getAlert().getHospitalizationDate());
        task5.setProvider(task5.getAlert().getProvider());




        taskRepository.saveAll(Arrays.asList(task1, task2, task3, task4, task5));


    }
}
