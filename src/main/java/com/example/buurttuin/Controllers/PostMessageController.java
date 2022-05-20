package com.example.buurttuin.Controllers;

import com.example.buurttuin.Services.PostMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostMessageController {

    private final PostMessageService postMessageService;

    @Autowired
    public PostMessageController(PostMessageService postMessageService) {
        this.postMessageService = postMessageService;
    }
}

