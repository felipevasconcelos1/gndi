package com.gndi.alertsapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String federalUnity;
    private String region;

    @JsonIgnore
    @OneToMany(mappedBy="city")
    private List<Alert> alerts = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "cityId")
    private List<Procedure> procedures = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "cityId")
    private List<Hospitalization> hospitalizations = new ArrayList<>();

    public City() {
    }

    public City(Integer id, String name, String federalUnity, String region) {
        this.id = id;
        this.name = name;
        this.federalUnity = federalUnity;
        this.region = region;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFederalUnity() {
        return federalUnity;
    }

    public void setFederalUnity(String federalUnity) {
        this.federalUnity = federalUnity;
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
        City city = (City) o;
        return id.equals(city.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
