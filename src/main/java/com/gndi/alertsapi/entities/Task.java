package com.gndi.alertsapi.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "beneficiary_id")
    private DmBeneficiary beneficiary;
    private LocalDate hospitalizationDate;
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private DmProvider provider;

    public Task() {}

    public Task(Integer id, DmBeneficiary beneficiary, LocalDate hospitalizationDate, DmProvider provider) {
        this.id = id;
        this.beneficiary = beneficiary;
        this.hospitalizationDate = hospitalizationDate;
        this.provider = provider;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public DmBeneficiary getBeneficiary() { return beneficiary; }

    public void setBeneficiary(DmBeneficiary beneficiary) { this.beneficiary = beneficiary; }

    public LocalDate getHospitalizationDate() { return hospitalizationDate; }

    public void setHospitalizationDate(LocalDate hospitalizationDate) {
        this.hospitalizationDate = hospitalizationDate;
    }

    public DmProvider getProvider() { return provider; }

    public void setProvider(DmProvider provider) { this.provider = provider; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id.equals(task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
