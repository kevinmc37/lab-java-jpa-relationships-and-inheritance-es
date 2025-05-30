package com.ironhack.labjavajparelationshipsandinheritancees;

import com.ironhack.labjavajparelationshipsandinheritancees.enums.memberStatus;
import com.ironhack.labjavajparelationshipsandinheritancees.model.Association.Member;
import com.ironhack.labjavajparelationshipsandinheritancees.repository.AssociationRepository;
import com.ironhack.labjavajparelationshipsandinheritancees.repository.DivisionRepository;
import com.ironhack.labjavajparelationshipsandinheritancees.repository.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LabJavaJpaRelationshipsAndInheritanceEsApplication {
    public static void main(String[] args) {
        SpringApplication.run(LabJavaJpaRelationshipsAndInheritanceEsApplication.class, args);
    }
}
