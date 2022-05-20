package com.example.buurttuin.Fields;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Lender {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "lender")
    private Set<Tool> tools = new HashSet<>();

    @OneToMany(mappedBy = "lender")
    private Set<Reservation> reservations = new HashSet<>();

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Set<Tool> getTools() {
        return tools;
    }

    public void setTools(Set<Tool> tools) {
        this.tools = tools;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
