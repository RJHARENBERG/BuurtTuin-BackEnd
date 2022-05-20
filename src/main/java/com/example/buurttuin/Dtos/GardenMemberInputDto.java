package com.example.buurttuin.Dtos;

import com.example.buurttuin.Fields.User;

public class GardenMemberInputDto {

    private Long id;

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
}
