package com.mentalhealththerapy.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ElementCollection;
import java.util.List;

@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ElementCollection
    private List<Long> members; // List of member IDs

    // Default constructor
    public Club() {}

    // Constructor with parameters
    public Club(String name, List<Long> members) {
        this.name = name;
        this.members = members;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getMembers() {
        return members;
    }

    public void setMembers(List<Long> members) {
        this.members = members;
    }
}
