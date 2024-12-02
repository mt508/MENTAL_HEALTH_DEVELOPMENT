package com.mentalhealththerapy.dao;
import com.mentalhealththerapy.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubDAO extends JpaRepository<Club, Long> {
    // Custom query methods can be added here

    // Find club by name
    List<Club> findByName(String name);

    // Find clubs by member ID (assuming member IDs are stored as a list)
    List<Club> findByMembersContaining(Long memberId);
}
