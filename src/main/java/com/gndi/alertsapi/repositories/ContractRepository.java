package com.gndi.alertsapi.repositories;

import com.gndi.alertsapi.entities.Contract;
import com.gndi.alertsapi.entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Integer> {

}
