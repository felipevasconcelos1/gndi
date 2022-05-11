package com.gndi.alertsapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    private Date competence;

    public Provider() {
    }

    public Provider(Integer id, Integer idProvider, Integer hospitalizationTotal
            , Integer outpatientTotal, Date competence) {
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

    public Date getCompetence() {
        return competence;
    }

    public void setCompetence(Date competence) {
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
