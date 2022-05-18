package com.example.buurttuin.Services;

import com.example.buurttuin.Repositorys.LenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LenderService {

   private final LenderRepository lenderRepository;

    @Autowired
    public LenderService(LenderRepository lenderRepository) {
        this.lenderRepository = lenderRepository;
    }
}
