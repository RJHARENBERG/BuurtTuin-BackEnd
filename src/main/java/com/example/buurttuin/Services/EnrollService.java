package com.example.buurttuin.Services;

import com.example.buurttuin.Repositorys.EnrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollService {

    private final EnrollRepository enrollRepository;

    @Autowired
    public EnrollService(EnrollRepository enrollRepository) {
        this.enrollRepository = enrollRepository;
    }
}
