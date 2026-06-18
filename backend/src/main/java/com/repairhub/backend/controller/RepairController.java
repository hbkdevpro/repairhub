package com.repairhub.backend.controller;

import com.repairhub.backend.model.Repair;
import com.repairhub.backend.service.RepairService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/repairs")
public class RepairController {

    private final RepairService repairService;

    public RepairController(RepairService repairService) {
        this.repairService = repairService;
    }

    @GetMapping
    public List<Repair> getAllRepairs() {
        return repairService.getAll();
    }
}
