package com.example.buurttuin.Controllers;

import com.example.buurttuin.Services.GeneralMassagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralMassagesController {

    private final GeneralMassagesService generalMassagesService;

    @Autowired
    public GeneralMassagesController(GeneralMassagesService generalMassagesService) {
        this.generalMassagesService = generalMassagesService;
    }
}
