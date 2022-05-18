package com.example.buurttuin.Services;

import com.example.buurttuin.Repositorys.GardenMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GardenCommitteeService {

    private final GardenMemberRepository gardenMemberRepository;

    @Autowired
    public GardenCommitteeService(GardenMemberRepository gardenMemberRepository) {
        this.gardenMemberRepository = gardenMemberRepository;
    }
}
