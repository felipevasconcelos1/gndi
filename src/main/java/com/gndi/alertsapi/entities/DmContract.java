package com.gndi.alertsapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class DmContract {
    @Id
    private String id;
    private String contractor;
    private String vidas;

    @JsonIgnore
    @OneToMany(mappedBy = "contractId")
    private List<Contract> contracts = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "contract")
    private List<Alert> alerts = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "contractId")
    private List<Beneficiary> beneficiaries = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "contractId")
    private List<Hospitalization> hospitalizations = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "contractId")
    private List<Procedure> procedures = new ArrayList<>();

    public DmContract() {}

    public DmContract(String id, String contractor, String vidas) {
        this.id = id;
        this.contractor = contractor;
        this.vidas = vidas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getVidas() {
        return vidas;
    }

    public void setVidas(String vidas) {
        this.vidas = vidas;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public List<Beneficiary> getBeneficiaries() {
        return beneficiaries;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public List<Hospitalization> getHospitalizations() {
        return hospitalizations;
    }

    public List<Procedure> getProcedures() {
        return procedures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmContract that = (DmContract) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
