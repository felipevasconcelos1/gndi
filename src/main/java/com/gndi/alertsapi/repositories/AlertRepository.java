package com.gndi.alertsapi.repositories;

import com.gndi.alertsapi.entities.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Integer> {

}
