package com.example.buurttuin.Dtos;

import com.example.buurttuin.Fields.Reservation;
import com.example.buurttuin.Fields.User;

import java.util.HashSet;
import java.util.Set;

public class ToolDto {
    private Long id;

    private String toolName;
    private String type;
    //    private toolImg;
    private String description;

    private User user;
    private Set<Reservation> reservations = new HashSet<>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
