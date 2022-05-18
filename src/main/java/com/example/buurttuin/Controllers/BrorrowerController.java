package com.example.buurttuin.Controllers;

import com.example.buurttuin.Services.BrorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrorrowerController {

    private final BrorrowerService brorrowerService;

    @Autowired
    public BrorrowerController(BrorrowerService brorrowerService) {
        this.brorrowerService = brorrowerService;
    }
}
