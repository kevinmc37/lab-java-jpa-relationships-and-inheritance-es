package com.ironhack.labjavajparelationshipsandinheritancees.model.TaskManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.math.BigDecimal;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Task {
    private BigDecimal hourlyRate;
}
