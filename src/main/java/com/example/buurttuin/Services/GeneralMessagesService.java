package com.example.buurttuin.Services;

import com.example.buurttuin.Repositorys.GeneralMessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralMessagesService {

    private final GeneralMessagesRepository generalMessagesRepository;

    @Autowired
    public GeneralMessagesService(GeneralMessagesRepository generalMessagesRepository) {
        this.generalMessagesRepository = generalMessagesRepository;
    }
}



