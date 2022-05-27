package com.gndi.alertsapi.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Procedure implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "beneficiary_id")
    private DmBeneficiary beneficiaryId; //dep
    private Integer requestingProviderId; // dep
    @ManyToOne
    @JoinColumn(name = "contract_id")
    private DmContract contractId;
    private Date hospitalizationDate;
    private Date dischargeDate;
    private String nature;
    private String regime;
    private Integer executorProviderId; //dep
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City cityId; // dep
    private String code;
    private String name;
    private Double value;
    private Integer quantity;
    private String classification;
    private Integer guideCode;
    private Integer account;
    private String cid;
    private Date emissionDate;
    private String guideStatus;
    private String mainGuide;
    private Date liberationDate;

    public Procedure() {
    }

    public Procedure(Integer id, DmBeneficiary beneficiaryId, Integer requestingProviderId, DmContract contractId
            , Date hospitalizationDate, Date dischargeDate, String nature, String regime
            , Integer executorProviderId, City cityId, String code, String name, Double value
            , Integer quantity, String classification, Integer guideCode, Integer account, String cid
            , Date emissionDate, String guideStatus, String mainGuide, Date liberationDate) {
        this.id = id;
        this.beneficiaryId = beneficiaryId;
        this.requestingProviderId = requestingProviderId;
        this.contractId = contractId;
        this.hospitalizationDate = hospitalizationDate;
        this.dischargeDate = dischargeDate;
        this.nature = nature;
        this.regime = regime;
        this.executorProviderId = executorProviderId;
        this.cityId = cityId;
        this.code = code;
        this.name = name;
        this.value = value;
        this.quantity = quantity;
        this.classification = classification;
        this.guideCode = guideCode;
        this.account = account;
        this.cid = cid;
        this.emissionDate = emissionDate;
        this.guideStatus = guideStatus;
        this.mainGuide = mainGuide;
        this.liberationDate = liberationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DmBeneficiary getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(DmBeneficiary beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public Integer getRequestingProviderId() {
        return requestingProviderId;
    }

    public void setRequestingProviderId(Integer requestingProviderId) {
        this.requestingProviderId = requestingProviderId;
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

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public Integer getExecutorProviderId() {
        return executorProviderId;
    }

    public void setExecutorProviderId(Integer executorProviderId) {
        this.executorProviderId = executorProviderId;
    }

    public City getCityId() {
        return cityId;
    }

    public void setCityId(City cityId) {
        this.cityId = cityId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Integer getGuideCode() {
        return guideCode;
    }

    public void setGuideCode(Integer guideCode) {
        this.guideCode = guideCode;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Date getEmissionDate() {
        return emissionDate;
    }

    public void setEmissionDate(Date emissionDate) {
        this.emissionDate = emissionDate;
    }

    public String getGuideStatus() {
        return guideStatus;
    }

    public void setGuideStatus(String guideStatus) {
        this.guideStatus = guideStatus;
    }

    public String getMainGuide() {
        return mainGuide;
    }

    public void setMainGuide(String mainGuide) {
        this.mainGuide = mainGuide;
    }

    public Date getLiberationDate() {
        return liberationDate;
    }

    public void setLiberationDate(Date liberationDate) {
        this.liberationDate = liberationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Procedure procedure = (Procedure) o;
        return id.equals(procedure.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
