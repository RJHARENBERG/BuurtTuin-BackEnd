package com.example.buurttuin.Controllers;

import com.example.buurttuin.Dtos.ToolDto;
import com.example.buurttuin.Dtos.ToolInputDto;
import com.example.buurttuin.Services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToolController {

    private final ToolService toolService;

    @Autowired
    public ToolController(ToolService toolService) {
        this.toolService = toolService;
    }

    @PostMapping("/add/tool")
    public ToolDto addTool (@RequestBody ToolInputDto toolInputDto){
        return toolService.addTool(toolInputDto);
    }
}
