package com.example.buurttuin.Controllers;

import com.example.buurttuin.Services.GeneralMessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralMessagesController {

    private final GeneralMessagesService generalMessagesService;

    @Autowired
    public GeneralMessagesController(GeneralMessagesService generalMessagesService) {
        this.generalMessagesService = generalMessagesService;
    }
}



