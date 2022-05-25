package com.example.buurttuin.Fields;

import javax.persistence.*;

@Entity
@Table(name = "gardenMember")
public class GardenMember {
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
