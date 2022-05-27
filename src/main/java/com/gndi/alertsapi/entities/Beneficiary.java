package com.gndi.alertsapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Beneficiary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "beneficiary_id")
    private DmBeneficiary beneficiary;
    @ManyToOne
    @JoinColumn(name = "contract_id")
    private DmContract contractId;
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

    public Beneficiary(Integer id, DmBeneficiary beneficiary, DmContract contractId ,Double totalCosts, Date timeStamp
            , Integer totalOpme, Integer nonPsychiatricHospitalizationDays
            , Integer psychiatricHospitalizationDays, Date lastDischargeDate, String program
            , Integer daysBetweenHospitalization) {
        this.id = id;
        this.beneficiary = beneficiary;
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

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public DmBeneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(DmBeneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    public DmContract getContractId() { return contractId; }

    public void setContractId(DmContract contractId) { this.contractId = contractId; }

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
        return beneficiary.equals(that.beneficiary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beneficiary);
    }
}
