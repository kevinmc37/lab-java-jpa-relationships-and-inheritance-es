package com.ironhack.labjavajparelationshipsandinheritancees.model.Nursing;

import com.ironhack.labjavajparelationshipsandinheritancees.enums.memberStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private memberStatus status;

    @ManyToMany(mappedBy = "members", fetch = FetchType.LAZY)
    private List<Division> divisions;

    private String name;
    private LocalDate renewalDate;
}
