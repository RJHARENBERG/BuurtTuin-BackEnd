package com.example.buurttuin.Controllers;

import com.example.buurttuin.Dtos.*;
import com.example.buurttuin.Exceptions.RecordNotFoundException;
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

    @PutMapping("gardenMember/{gardenMember_id}/user/{user_id}")
    public GardenMemberDto assignGardenMemberToUser(@PathVariable Long gardenMember_id,
                                        @PathVariable Long user_id) throws RecordNotFoundException {
        return gardenMemberService.assignGardenMemberToUser(gardenMember_id, user_id);
    }


}
