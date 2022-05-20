package com.example.buurttuin.Fields;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "gardenMember")
public class GardenMember {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "gardenMember")
    private User user;

//    private Set<Enroll> enrolls = new HashSet<>();
//
//    private Set<Response> responses = new HashSet<>();


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
}
