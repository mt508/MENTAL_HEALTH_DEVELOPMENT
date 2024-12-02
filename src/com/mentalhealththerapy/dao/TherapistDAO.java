package com.mentalhealththerapy.dao;
import com.mentalhealththerapy.model.Therapist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TherapistDAO extends JpaRepository<Therapist, Long> {
    // Custom query methods can be added here

    // Find therapist by specialization
    List<Therapist> findBySpecialization(String specialization);

    // Find therapist by name
    List<Therapist> findByName(String name);
}
