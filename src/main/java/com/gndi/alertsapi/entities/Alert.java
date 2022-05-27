package com.gndi.alertsapi.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Alert implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer hospitalizationId;

    @ManyToOne
    @JoinColumn(name = "beneficiary_id")
    private DmBeneficiary beneficiary;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant hospitalizationDate;


    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    private Integer beneficiaryAge;
    private Integer vidasContract;
    private Double beneficiaryTotalCosts;
    private Integer totalOpme;
    private Integer psychiatricHospitalizationDays;
    private Integer nonPsychiatricHospitalizationDays;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant lastDischargeDate;
    private Double totalContractCost;
    private Double totalCoparticipationCosts;
    private Double totalContractRevenue;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;

    private Boolean gpCost;
    private Boolean gpOpme;
    private Boolean gpHospitalization;
    private Boolean gpPsychiatricHospitalizationDays;
    private Boolean gpRecentHospitalization;
    private Boolean gpSinistrality;
    private Boolean gpAge;

    private LocalDate creationDate;

    private Boolean gpProgram;
    private String program;
    private String networkType;
    private String region;



    public Alert() {
    }

    public Alert(Integer id, Integer hospitalizationId , Instant hospitalizationDate, City city
            , Provider provider, Integer beneficiaryAge, Integer vidasContract, Double beneficiaryTotalCosts
            , Integer totalOpme, Integer psychiatricHospitalizationDays, Integer nonPsychiatricHospitalizationDays
            , Instant lastDischargeDate, Double totalContractCost, Double totalCoparticipationCosts
            , Double totalContractRevenue, Contract contract, Boolean gpCost, Boolean gpOpme
            , Boolean gpHospitalization, Boolean gpPsychiatricHospitalizationDays, Boolean gpRecentHospitalization
            , Boolean gpSinistrality, Boolean gpAge, LocalDate creationDate, Boolean gpProgram, String program
            , String networkType, String region, DmBeneficiary beneficiary) {
        this.id = id;
        this.hospitalizationId = hospitalizationId;
        this.hospitalizationDate = hospitalizationDate;
        this.city = city;
        this.provider = provider;
        this.beneficiaryAge = beneficiaryAge;
        this.vidasContract = vidasContract;
        this.beneficiaryTotalCosts = beneficiaryTotalCosts;
        this.totalOpme = totalOpme;
        this.psychiatricHospitalizationDays = psychiatricHospitalizationDays;
        this.nonPsychiatricHospitalizationDays = nonPsychiatricHospitalizationDays;
        this.lastDischargeDate = lastDischargeDate;
        this.totalContractCost = totalContractCost;
        this.totalCoparticipationCosts = totalCoparticipationCosts;
        this.totalContractRevenue = totalContractRevenue;
        this.contract = contract;
        this.gpCost = gpCost;
        this.gpOpme = gpOpme;
        this.gpHospitalization = gpHospitalization;
        this.gpPsychiatricHospitalizationDays = gpPsychiatricHospitalizationDays;
        this.gpRecentHospitalization = gpRecentHospitalization;
        this.gpSinistrality = gpSinistrality;
        this.gpAge = gpAge;
        this.creationDate = creationDate;
        this.gpProgram = gpProgram;
        this.program = program;
        this.networkType = networkType;
        this.region = region;
        this.beneficiary = beneficiary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHospitalizationId() {
        return hospitalizationId;
    }

    public void setHospitalizationId(Integer hospitalizationId) {
        this.hospitalizationId = hospitalizationId;
    }


    public Instant getHospitalizationDate() {
        return hospitalizationDate;
    }

    public void setHospitalizationDate(Instant hospitalizationDate) {
        this.hospitalizationDate = hospitalizationDate;
    }

    public Provider getProvider() { return provider; }

    public void setProvider(Provider provider) { this.provider = provider; }

    public Integer getBeneficiaryAge() { return beneficiaryAge; }

    public void setBeneficiaryAge(Integer beneficiaryAge) {
        this.beneficiaryAge = beneficiaryAge;
    }

    public Integer getVidasContract() {
        return vidasContract;
    }

    public void setVidasContract(Integer vidasContract) {
        vidasContract = vidasContract;
    }

    public Double getBeneficiaryTotalCosts() {
        return beneficiaryTotalCosts;
    }

    public void setBeneficiaryTotalCosts(Double beneficiaryTotalCosts) {
        this.beneficiaryTotalCosts = beneficiaryTotalCosts;
    }

    public Integer getTotalOpme() {
        return totalOpme;
    }

    public void setTotalOpme(Integer totalOpme) {
        this.totalOpme = totalOpme;
    }

    public Integer getPsychiatricHospitalizationDays() {
        return psychiatricHospitalizationDays;
    }

    public void setPsychiatricHospitalizationDays(Integer psychiatricHospitalizationDays) {
        this.psychiatricHospitalizationDays = psychiatricHospitalizationDays;
    }

    public Integer getNonPsychiatricHospitalizationDays() {
        return nonPsychiatricHospitalizationDays;
    }

    public void setNonPsychiatricHospitalizationDays(Integer nonPsychiatricHospitalizationDays) {
        this.nonPsychiatricHospitalizationDays = nonPsychiatricHospitalizationDays;
    }

    public Instant getLastDischargeDate() {
        return lastDischargeDate;
    }

    public void setLastDischargeDate(Instant lastDischargeDate) {
        this.lastDischargeDate = lastDischargeDate;
    }

    public Double getTotalContractCost() {
        return totalContractCost;
    }

    public void setTotalContractCost(Double totalContractCost) {
        this.totalContractCost = totalContractCost;
    }

    public Double getTotalCoparticipationCosts() {
        return totalCoparticipationCosts;
    }

    public void setTotalCoparticipationCosts(Double totalCoparticipationCosts) {
        this.totalCoparticipationCosts = totalCoparticipationCosts;
    }

    public Double getTotalContractRevenue() {
        return totalContractRevenue;
    }

    public void setTotalContractRevenue(Double totalContractRevenue) {
        this.totalContractRevenue = totalContractRevenue;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Boolean getGpCost() {
        return gpCost;
    }

    public void setGpCost(Boolean gpCost) {
        this.gpCost = gpCost;
    }

    public Boolean getGpOpme() {
        return gpOpme;
    }

    public void setGpOpme(Boolean gpOpme) {
        this.gpOpme = gpOpme;
    }

    public Boolean getGpHospitalization() {
        return gpHospitalization;
    }

    public void setGpHospitalization(Boolean gpHospitalization) {
        this.gpHospitalization = gpHospitalization;
    }

    public Boolean getGpPsychiatricHospitalizationDays() {
        return gpPsychiatricHospitalizationDays;
    }

    public void setGpPsychiatricHospitalizationDays(Boolean gpPsychiatricHospitalizationDays) {
        this.gpPsychiatricHospitalizationDays = gpPsychiatricHospitalizationDays;
    }

    public Boolean getGpRecentHospitalization() {
        return gpRecentHospitalization;
    }

    public void setGpRecentHospitalization(Boolean gpRecentHospitalization) {
        this.gpRecentHospitalization = gpRecentHospitalization;
    }

    public Boolean getGpSinistrality() {
        return gpSinistrality;
    }

    public void setGpSinistrality(Boolean gpSinistrality) {
        this.gpSinistrality = gpSinistrality;
    }

    public Boolean getGpAge() {
        return gpAge;
    }

    public void setGpAge(Boolean gpAge) {
        this.gpAge = gpAge;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getGpProgram() {
        return gpProgram;
    }

    public void setGpProgram(Boolean gpProgram) {
        this.gpProgram = gpProgram;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DmBeneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(DmBeneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alert alert = (Alert) o;
        return id.equals(alert.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
