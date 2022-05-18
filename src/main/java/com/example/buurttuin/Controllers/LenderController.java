package com.example.buurttuin.Controllers;

import com.example.buurttuin.Services.LenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LenderController {

    private final LenderService lenderService;

    @Autowired
    public LenderController(LenderService lenderService) {
        this.lenderService = lenderService;
    }
}
