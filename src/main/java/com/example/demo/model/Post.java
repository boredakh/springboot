package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private Long passcode;
    private Boolean active;
    private Boolean icRating;
    private Double hjRating;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Long getPasscode() { return passcode; }
    public void setPasscode(Long passcode) { this.passcode = passcode; }
    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
    public Boolean getIcRating() { return icRating; }
    public void setIcRating(Boolean icRating) { this.icRating = icRating; }
    public Double getHjRating() { return hjRating; }
    public void setHjRating(Double hjRating) { this.hjRating = hjRating; }
}