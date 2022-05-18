package com.example.buurttuin.Services;

import com.example.buurttuin.Repositorys.GeneralMassagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralMassagesService {

    private final GeneralMassagesRepository generalMassagesRepository;

    @Autowired
    public GeneralMassagesService(GeneralMassagesRepository generalMassagesRepository) {
        this.generalMassagesRepository = generalMassagesRepository;
    }
}
