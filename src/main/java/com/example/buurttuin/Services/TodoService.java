package com.example.buurttuin.Services;

import com.example.buurttuin.Repositorys.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final ToolRepository toolRepository;

    @Autowired
    public TodoService(ToolRepository toolRepository) {
        this.toolRepository = toolRepository;
    }
}
