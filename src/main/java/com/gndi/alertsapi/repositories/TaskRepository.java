package com.gndi.alertsapi.repositories;

import com.gndi.alertsapi.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {


}
