package com.gndi.alertsapi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Hospitalization implements Serializable {
    private Integer id;
    private Integer beneficiaryId;
    private String contractId;
    private Date hospitalizationDate;
    private Date alertCreation;
    private Long cityId;
    private Long providerId;
    private String natureGuide;
    private String networkType;
    private String region;

    public Hospitalization() {
    }

    public Hospitalization(Integer id, Integer beneficiaryId, String contractId
            , Date hospitalizationDate, Date alertCreation, Long cityId, Long providerId
            , String natureGuide, String networkType, String region) {
        this.id = id;
        this.beneficiaryId = beneficiaryId;
        this.contractId = contractId;
        this.hospitalizationDate = hospitalizationDate;
        this.alertCreation = alertCreation;
        this.cityId = cityId;
        this.providerId = providerId;
        this.natureGuide = natureGuide;
        this.networkType = networkType;
        this.region = region;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public Integer getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(Integer beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Date getHospitalizationDate() {
        return hospitalizationDate;
    }

    public void setHospitalizationDate(Date hospitalizationDate) {
        this.hospitalizationDate = hospitalizationDate;
    }

    public Date getAlertCreation() {
        return alertCreation;
    }

    public void setAlertCreation(Date alertCreation) {
        this.alertCreation = alertCreation;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public String getNatureGuide() {
        return natureGuide;
    }

    public void setNatureGuide(String natureGuide) {
        this.natureGuide = natureGuide;
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
        Hospitalization that = (Hospitalization) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
