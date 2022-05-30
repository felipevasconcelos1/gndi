package com.gndi.alertsapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class DmBeneficiary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer age;
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "beneficiary")
    private List<Beneficiary> beneficiaries = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy="beneficiary")
    private List<Alert> alerts = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "beneficiaryId")
    private List<Hospitalization> hospitalizations = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "beneficiaryId")
    private List<Procedure> procedures = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "beneficiary")
    private List<Task> tasks = new ArrayList<>();

    public DmBeneficiary() {}

    public DmBeneficiary (Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public List<Beneficiary> getBeneficiaries() {
        return beneficiaries;
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
        DmBeneficiary that = (DmBeneficiary) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
