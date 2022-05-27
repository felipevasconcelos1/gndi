package com.gndi.alertsapi.repositories;

import com.gndi.alertsapi.entities.Beneficiary;
import com.gndi.alertsapi.entities.DmBeneficiary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DmBeneficiaryRepository extends JpaRepository<DmBeneficiary, Integer> {

}
