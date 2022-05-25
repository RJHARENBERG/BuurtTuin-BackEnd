package com.example.buurttuin.Controllers;

import com.example.buurttuin.Dtos.LenderDto;
import com.example.buurttuin.Dtos.LenderInputDto;
import com.example.buurttuin.Services.LenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LenderController {

    private final LenderService lenderService;

    @Autowired
    public LenderController(LenderService lenderService) {
        this.lenderService = lenderService;
    }

    @PostMapping("/add/lender")
    public LenderDto addlender (@RequestBody LenderInputDto lenderInputDto){
        return lenderService.addLender(lenderInputDto);
    }

}
