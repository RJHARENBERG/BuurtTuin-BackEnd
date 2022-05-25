package com.example.buurttuin.Fields;

import javax.persistence.*;

@Entity
@Table(name = "lender")
public class Lender {
    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
