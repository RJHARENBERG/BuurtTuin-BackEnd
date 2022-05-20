package com.example.buurttuin.Controllers;

import com.example.buurttuin.Dtos.LenderDto;
import com.example.buurttuin.Dtos.LenderInputDto;
import com.example.buurttuin.Exceptions.RecordNotFoundException;
import com.example.buurttuin.Services.LenderService;
import com.example.buurttuin.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LenderController {

    private final LenderService lenderService;
    private final UserService userService;

    @Autowired
    public LenderController(LenderService lenderService, UserService userService) {
        this.lenderService = lenderService;
        this.userService = userService;
    }

    @PostMapping("/add/lender")
    public LenderDto addlender (@RequestBody LenderInputDto lenderInputDto){
        return lenderService.addLender(lenderInputDto);
    }

    @PutMapping("lender/{lender_id}/user/{user_id}")
    public LenderDto assignLenderToUser(@PathVariable Long lender_id,
                                        @PathVariable Long user_id) throws RecordNotFoundException {
        return lenderService.assignLenderToUser(lender_id, user_id);
    }


}
