package com.repairhub.backend.service;


import com.repairhub.backend.model.Repair;
import com.repairhub.backend.repository.RepairRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairService {

    private final RepairRepository repairRepository;

    public RepairService(RepairRepository repairRepository) {
        this.repairRepository = repairRepository;
    }

    public List<Repair> getAll() {
        return repairRepository.findAll();
    }
}

