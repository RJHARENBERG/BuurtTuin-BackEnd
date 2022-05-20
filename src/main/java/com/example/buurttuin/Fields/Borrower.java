package com.example.buurttuin.Fields;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "borrower")
public class Borrower {
    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @OneToOne(mappedBy = "borrower")
    private User user;

    @OneToMany(mappedBy = "borrower")
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
}
