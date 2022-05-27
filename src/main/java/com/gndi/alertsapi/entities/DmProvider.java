package com.gndi.alertsapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
public class DmProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private  String local;

    // Dependencies
    @JsonIgnore
    @OneToMany(mappedBy = "provider")
    private List<Alert> alerts = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "providerId")
    private List<Hospitalization> hospitalizations = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "idProvider")
    private List<Provider> providers = new ArrayList<>();

    // Procedure (ManyToMany) ? - Dúvidas

    public DmProvider() {}

    public DmProvider(Integer id, String name, String local) {
        this.id = id;
        this.name = name;
        this.local = local;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public List<Provider> getProviders() { return providers; }

    public List<Hospitalization> getHospitalizations() { return hospitalizations; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmProvider that = (DmProvider) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
