package com.gndi.alertsapi.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Provider implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private DmProvider idProvider;
    private Integer hospitalizationTotal;
    private Integer outpatientTotal;
    private LocalDate competence;


    public Provider() {}

    public Provider(Integer id, DmProvider idProvider, Integer hospitalizationTotal
            , Integer outpatientTotal, LocalDate competence) {
        this.id = id;
        this.idProvider = idProvider;
        this.hospitalizationTotal = hospitalizationTotal;
        this.outpatientTotal = outpatientTotal;
        this.competence = competence;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DmProvider getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(DmProvider idProvider) {
        this.idProvider = idProvider;
    }

    public Integer getHospitalizationTotal() {
        return hospitalizationTotal;
    }

    public void setHospitalizationTotal(Integer hospitalizationTotal) {
        this.hospitalizationTotal = hospitalizationTotal;
    }

    public Integer getOutpatientTotal() {
        return outpatientTotal;
    }

    public void setOutpatientTotal(Integer outpatientTotal) {
        this.outpatientTotal = outpatientTotal;
    }

    public LocalDate getCompetence() {
        return competence;
    }

    public void setCompetence(LocalDate competence) {
        this.competence = competence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return id.equals(provider.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
