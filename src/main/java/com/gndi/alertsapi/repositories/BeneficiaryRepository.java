package com.gndi.alertsapi.repositories;

import com.gndi.alertsapi.entities.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Integer> {

}
