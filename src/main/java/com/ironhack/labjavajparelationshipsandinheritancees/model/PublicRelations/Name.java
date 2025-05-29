package com.ironhack.labjavajparelationshipsandinheritancees.model.PublicRelations;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Name {
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
}
