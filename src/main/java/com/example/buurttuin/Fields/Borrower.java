package com.example.buurttuin.Fields;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Borrower {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "borrower")
    private Set<Reservation> reservations = new HashSet<>();

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
}
