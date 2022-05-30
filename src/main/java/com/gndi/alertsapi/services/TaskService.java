package com.gndi.alertsapi.services;

import com.gndi.alertsapi.entities.Task;
import com.gndi.alertsapi.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Task findbyId(Integer id) {
        Optional<Task> object = repository.findById(id);
        return object.get();
    }

}
