package com.ironhack.labjavajparelationshipsandinheritancees.model.Nursing;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "association_id")
    private Association association;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "president_id")
    private Member president;

    @ManyToMany(mappedBy = "divisions", fetch = FetchType.LAZY)
    private List<Member> members;

    private String name;
    private String district;
}
