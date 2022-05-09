package com.gndi.alertsapi.entities;

import java.util.Date;

public class Beneficiary {
    private Integer id;
    private Integer beneficiaryId;
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

    public Beneficiary(Integer id, Integer beneficiaryId, Double totalCosts, Date timeStamp
            , Integer totalOpme, Integer nonPsychiatricHospitalizationDays
            , Integer psychiatricHospitalizationDays, Date lastDischargeDate, String program
            , Integer daysBetweenHospitalization) {
        this.id = id;
        this.beneficiaryId = beneficiaryId;
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
}
