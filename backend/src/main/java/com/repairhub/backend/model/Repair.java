package com.repairhub.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deviceType;
    private String brand;
    private String model;

    private String customerName;
    private String customerPhone;

    private String description;

    @Enumerated(EnumType.STRING)
    private RepairStatus status;

    private Double estimatedPrice;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}