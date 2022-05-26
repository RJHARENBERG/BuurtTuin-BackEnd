package com.example.buurttuin.Controllers;

import com.example.buurttuin.Dtos.*;
import com.example.buurttuin.Services.GardenMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GardenMemberController {

    private final GardenMemberService gardenMemberService;

    @Autowired
    public GardenMemberController(GardenMemberService gardenMemberService) {
        this.gardenMemberService = gardenMemberService;
    }

    @PostMapping("/add/gardenMember")
    public GardenMemberDto addTest (@RequestBody GardenMemberInputDto  gardenMemberInputDto){
        return gardenMemberService.addGardenMember( gardenMemberInputDto);
    }
}
