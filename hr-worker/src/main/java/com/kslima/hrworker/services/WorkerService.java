package com.kslima.hrworker.services;

import com.kslima.hrworker.entities.Worker;
import com.kslima.hrworker.repositories.WorkerRepository;
import com.kslima.hrworker.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    public Worker findById(Long id) {
        Optional<Worker> optWorker = workerRepository.findById(id);
        return optWorker.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
    }
}
