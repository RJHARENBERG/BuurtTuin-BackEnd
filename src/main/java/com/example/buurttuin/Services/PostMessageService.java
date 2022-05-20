package com.example.buurttuin.Services;

import com.example.buurttuin.Repositorys.PostMessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostMessageService {

   private final PostMessagesRepository postMessagesRepository;

   @Autowired
    public PostMessageService(PostMessagesRepository postMessagesRepository) {
        this.postMessagesRepository = postMessagesRepository;
    }
}

