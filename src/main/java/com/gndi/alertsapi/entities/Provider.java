package com.gndi.alertsapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Provider implements Serializable {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idProvider;
    private Integer hospitalizationTotal;
    private Integer outpatientTotal;
    private Instant competence;

    @JsonIgnore
    @OneToMany(mappedBy = "provider")
    private List<Alert> alerts = new ArrayList<>();

    public Provider() {
    }

    public Provider(Integer id, Integer idProvider, Integer hospitalizationTotal
            , Integer outpatientTotal, Instant competence) {
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
        this.idProvider = id;
    }

    public Integer getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(Integer idProvider) {
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

    public Instant getCompetence() {
        return competence;
    }

    public void setCompetence(Instant competence) {
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
