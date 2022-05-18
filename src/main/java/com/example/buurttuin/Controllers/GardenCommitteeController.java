package com.example.buurttuin.Controllers;

import com.example.buurttuin.Services.GardenCommitteeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GardenCommitteeController {

    private final GardenCommitteeService gardenCommitteeService;

    @Autowired
    public GardenCommitteeController(GardenCommitteeService gardenCommitteeService) {
        this.gardenCommitteeService = gardenCommitteeService;
    }
}
