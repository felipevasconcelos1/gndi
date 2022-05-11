package com.gndi.alertsapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Beneficiary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer beneficiaryId;
    private String contractId;
    private Double totalCosts;
    private Date timeStamp;
    private Integer totalOpme;
    private Integer nonPsychiatricHospitalizationDays;
    private Integer psychiatricHospitalizationDays;
    private Date lastDischargeDate;
    private String program;
    private Integer daysBetweenHospitalization;


    public Beneficiary() {
    }

    public Beneficiary(Integer id, Integer beneficiaryId, String contractId ,Double totalCosts, Date timeStamp
            , Integer totalOpme, Integer nonPsychiatricHospitalizationDays
            , Integer psychiatricHospitalizationDays, Date lastDischargeDate, String program
            , Integer daysBetweenHospitalization) {
        this.id = id;
        this.beneficiaryId = beneficiaryId;
        this.contractId = contractId;
        this.totalCosts = totalCosts;
        this.timeStamp = timeStamp;
        this.totalOpme = totalOpme;
        this.nonPsychiatricHospitalizationDays = nonPsychiatricHospitalizationDays;
        this.psychiatricHospitalizationDays = psychiatricHospitalizationDays;
        this.lastDischargeDate = lastDischargeDate;
        this.program = program;
        this.daysBetweenHospitalization = daysBetweenHospitalization;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(Integer beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public String getContractId() { return contractId; }

    public void setContractId(String contractId) { this.contractId = contractId; }

    public Double getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(Double totalCosts) {
        this.totalCosts = totalCosts;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getTotalOpme() {
        return totalOpme;
    }

    public void setTotalOpme(Integer totalOpme) {
        this.totalOpme = totalOpme;
    }

    public Integer getNonPsychiatricHospitalizationDays() {
        return nonPsychiatricHospitalizationDays;
    }

    public void setNonPsychiatricHospitalizationDays(Integer nonPsychiatricHospitalizationDays) {
        this.nonPsychiatricHospitalizationDays = nonPsychiatricHospitalizationDays;
    }

    public Integer getPsychiatricHospitalizationDays() {
        return psychiatricHospitalizationDays;
    }

    public void setPsychiatricHospitalizationDays(Integer psychiatricHospitalizationDays) {
        this.psychiatricHospitalizationDays = psychiatricHospitalizationDays;
    }

    public Date getLastDischargeDate() {
        return lastDischargeDate;
    }

    public void setLastDischargeDate(Date lastDischargeDate) {
        this.lastDischargeDate = lastDischargeDate;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Integer getDaysBetweenHospitalization() {
        return daysBetweenHospitalization;
    }

    public void setDaysBetweenHospitalization(Integer daysBetweenHospitalization) {
        this.daysBetweenHospitalization = daysBetweenHospitalization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beneficiary that = (Beneficiary) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
