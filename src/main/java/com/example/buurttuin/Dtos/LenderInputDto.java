package com.example.buurttuin.Dtos;

import com.example.buurttuin.Fields.Reservation;
import com.example.buurttuin.Fields.Tool;
import com.example.buurttuin.Fields.User;

import java.util.HashSet;
import java.util.Set;

public class LenderInputDto {

    private Long id;
    private User user;
    private Set<Tool> tools = new HashSet<>();
    private Set<Reservation> reservations = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Tool> getTools() {
        return tools;
    }

    public void setTools(Set<Tool> tools) {
        this.tools = tools;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}