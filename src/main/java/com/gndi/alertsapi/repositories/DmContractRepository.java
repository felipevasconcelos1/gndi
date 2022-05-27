package com.gndi.alertsapi.repositories;

import com.gndi.alertsapi.entities.Contract;
import com.gndi.alertsapi.entities.DmContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DmContractRepository extends JpaRepository<DmContract, Integer> {

}
