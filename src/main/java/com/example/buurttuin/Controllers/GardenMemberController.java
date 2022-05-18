package com.example.buurttuin.Controllers;

import com.example.buurttuin.Services.GardenMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GardenMemberController {

    private final GardenMemberService gardenMemberService;

    @Autowired
    public GardenMemberController(GardenMemberService gardenMemberService) {
        this.gardenMemberService = gardenMemberService;
    }
}
