package com.mentalhealththerapy.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long therapistId;
    private Long userId;
    private String status;  // Could be "Scheduled", "Completed", etc.
    private String sessionDate;

    // Default constructor
    public Session() {}

    // Constructor with parameters
    public Session(Long therapistId, Long userId, String status, String sessionDate) {
        this.therapistId = therapistId;
        this.userId = userId;
        this.status = status;
        this.sessionDate = sessionDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(Long therapistId) {
        this.therapistId = therapistId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }
}
