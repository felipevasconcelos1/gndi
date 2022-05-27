package com.gndi.alertsapi.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Hospitalization implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "beneficiaryId")
    private DmBeneficiary beneficiaryId;
    @ManyToOne
    @JoinColumn(name = "contract_id")
    private DmContract contractId;
    private Date hospitalizationDate;
    private Date alertCreation;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City cityId;
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private DmProvider providerId;
    private String natureGuide;
    private String networkType;
    private String region;



    public Hospitalization() {
    }

    public Hospitalization(Integer id, DmBeneficiary beneficiaryId, DmContract contractId
            , Date hospitalizationDate, Date alertCreation, City cityId, DmProvider providerId
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

    public DmBeneficiary getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(DmBeneficiary beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public DmContract getContractId() {
        return contractId;
    }

    public void setContractId(DmContract contractId) {
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

    public City getCityId() {
        return cityId;
    }

    public void setCityId(City cityId) {
        this.cityId = cityId;
    }

    public DmProvider getProviderId() {
        return providerId;
    }

    public void setProviderId(DmProvider providerId) {
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
