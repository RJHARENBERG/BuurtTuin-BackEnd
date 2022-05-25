package com.example.buurttuin.Fields;

import javax.persistence.*;

@Entity
@Table(name = "lender")
public class Lender {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void assignUser(User user) {
        this.user = user;
    }
}
