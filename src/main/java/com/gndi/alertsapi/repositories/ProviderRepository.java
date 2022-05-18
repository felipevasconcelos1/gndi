package com.gndi.alertsapi.repositories;

import com.gndi.alertsapi.entities.City;
import com.gndi.alertsapi.entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Integer> {

}
