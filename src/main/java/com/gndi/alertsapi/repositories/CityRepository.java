package com.gndi.alertsapi.repositories;

import com.gndi.alertsapi.entities.Beneficiary;
import com.gndi.alertsapi.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {

}
