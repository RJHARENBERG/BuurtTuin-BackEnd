package com.example.buurttuin.Services;

import com.example.buurttuin.Repositorys.BorrowerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrorrowerService {

    private final BorrowerRepository borrowerRepository;

    @Autowired
    public BrorrowerService(BorrowerRepository borrowerRepository) {
        this.borrowerRepository = borrowerRepository;
    }
}
