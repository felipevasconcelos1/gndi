package com.gndi.alertsapi.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name="tb_alert")
public class Alert implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer hospitalizationId;
    //private Integer beneficiaryId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant hospitalizationDate;

    private Integer cityId;
    private Integer providerId;
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
    private String contractId;
    private Boolean gpCost;
    private Boolean gpOpme;
    private Boolean gpHospitalization;
    private Boolean gpPsychiatricHospitalizationDays;
    private Boolean gpRecentHospitalization;
    private Boolean gpSinistrality;
    private Boolean gpAge;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant creationDate;

    private Boolean gpProgram;
    private String program;
    private String networkType;
    private String region;

    @ManyToOne
    @JoinColumn(name = "beneficiary_id")
    private Beneficiary beneficiary;

    public Alert() {
    }

    public Alert(Integer id, Integer hospitalizationId , Instant hospitalizationDate, Integer cityId
            , Integer providerId, Integer beneficiaryAge, Integer vidasContract, Double beneficiaryTotalCosts
            , Integer totalOpme, Integer psychiatricHospitalizationDays, Integer nonPsychiatricHospitalizationDays
            , Instant lastDischargeDate, Double totalContractCost, Double totalCoparticipationCosts
            , Double totalContractRevenue, String contractId, Boolean gpCost, Boolean gpOpme
            , Boolean gpHospitalization, Boolean gpPsychiatricHospitalizationDays, Boolean gpRecentHospitalization
            , Boolean gpSinistrality, Boolean gpAge, Instant creationDate, Boolean gpProgram, String program
            , String networkType, String region) {
        this.id = id;
        this.hospitalizationId = hospitalizationId;
        this.hospitalizationDate = hospitalizationDate;
        this.cityId = cityId;
        this.providerId = providerId;
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
        this.contractId = contractId;
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
    /*
    public Integer getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(Integer beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

     */

    public Instant getHospitalizationDate() {
        return hospitalizationDate;
    }

    public void setHospitalizationDate(Instant hospitalizationDate) {
        this.hospitalizationDate = hospitalizationDate;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public Integer getBeneficiaryAge() {
        return beneficiaryAge;
    }

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

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
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

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
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
