package com.mentalhealththerapy.dao;
import com.mentalhealththerapy.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SessionDAO extends JpaRepository<Session, Long> {
    // Custom query methods can be added here

    // Find all sessions by therapist ID
    List<Session> findByTherapistId(Long therapistId);

    // Find all sessions by user ID
    List<Session> findByUserId(Long userId);

    // Find all sessions by status
    List<Session> findByStatus(String status);

    // Find sessions scheduled on a specific date
    List<Session> findBySessionDate(String sessionDate);
}
