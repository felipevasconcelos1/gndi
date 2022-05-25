package com.gndi.alertsapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String contractId;
    private Double totalCost;
    private Double totalCoParticipation;
    private Double totalRevenue;

    @JsonIgnore
    @OneToMany(mappedBy = "contract")
    private List<Alert> alerts = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "contractId")
    private List<Beneficiary> beneficiaries = new ArrayList<>();

    public Contract() {
    }

    public Contract(Integer id, String contractId, Double totalCost
            , Double totalCoParticipation, Double totalRevenue) {
        this.id = id;
        this.contractId = contractId;
        this.totalCost = totalCost;
        this.totalCoParticipation = totalCoParticipation;
        this.totalRevenue = totalRevenue;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalCoParticipation() {
        return totalCoParticipation;
    }

    public void setTotalCoParticipation(Double totalCoParticipation) {
        this.totalCoParticipation = totalCoParticipation;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return id.equals(contract.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
