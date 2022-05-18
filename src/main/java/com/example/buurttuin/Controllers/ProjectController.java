package com.example.buurttuin.Controllers;

import com.example.buurttuin.Services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }
}
