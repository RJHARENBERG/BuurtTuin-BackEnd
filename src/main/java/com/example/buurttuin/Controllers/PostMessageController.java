package com.example.buurttuin.Controllers;

import com.example.buurttuin.Services.PostMassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostMessageController {

    private final PostMassageService postMassageService;

    @Autowired
    public PostMessageController(PostMassageService postMassageService) {
        this.postMassageService = postMassageService;
    }
}
