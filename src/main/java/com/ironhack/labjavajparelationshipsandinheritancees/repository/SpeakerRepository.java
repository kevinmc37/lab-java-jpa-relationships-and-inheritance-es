package com.ironhack.labjavajparelationshipsandinheritancees.repository;

import com.ironhack.labjavajparelationshipsandinheritancees.model.EventManagement.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {}
