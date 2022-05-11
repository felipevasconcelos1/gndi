package com.gndi.alertsapi.entities;

import java.io.Serializable;
import java.util.Objects;

public class Contract implements Serializable {
    private Integer id;
    private String contractId;
    private Double totalCost;
    private Double totalCoParticipation;
    private Double totalRevenue;

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
