package com.ironhack.labjavajparelationshipsandinheritancees;

import com.ironhack.labjavajparelationshipsandinheritancees.enums.memberStatus;
import com.ironhack.labjavajparelationshipsandinheritancees.model.Nursing.Member;
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

    @Bean
    CommandLineRunner run(AssociationRepository associationRepository,
                          DivisionRepository divisionRepository, MemberRepository memberRepository) {
        return args -> {
            Member tommy = memberRepository.save(new Member(0, memberStatus.ACTIVE, ))
            Customer tomJones = customerRepo.save(new Customer(0, "Tom Jones", CustomerStatus.GOLD, 205767));

            Flight flight1 = flightRepo.save(new Flight(0, "DL143", "Boeing 747", 400, 135));
            Flight flight2 = flightRepo.save(new Flight(0, "DL122", "Airbus A330", 236, 4370));
            Flight flight3 = flightRepo.save(new Flight(0, "DL53", "Boeing 777", 264, 2078));

            bookingRepo.save(new FlightBooking(0, agustineRiviera.getId(), flight1.getId()));
            bookingRepo.save(new FlightBooking(0, alainaSepulvida.getId(), flight2.getId()));
            bookingRepo.save(new FlightBooking(0, tomJones.getId(), flight3.getId()));
        };
}
