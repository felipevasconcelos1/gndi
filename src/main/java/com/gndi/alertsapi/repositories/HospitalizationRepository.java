package com.gndi.alertsapi.repositories;

import com.gndi.alertsapi.entities.Hospitalization;
import com.gndi.alertsapi.entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalizationRepository extends JpaRepository<Hospitalization, Integer> {

}
