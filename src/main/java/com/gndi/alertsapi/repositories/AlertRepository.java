package com.gndi.alertsapi.repositories;

import com.gndi.alertsapi.entities.Alert;
import com.gndi.alertsapi.entities.DmBeneficiary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertRepository extends JpaRepository<Alert, Integer> {


}
