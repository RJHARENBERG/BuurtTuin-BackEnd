package com.example.buurttuin.Controllers;

import com.example.buurttuin.Dtos.TestDto;
import com.example.buurttuin.Dtos.TestInputDto;
import com.example.buurttuin.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }


    @PostMapping("/add/test")
    public TestDto addTest (@RequestBody TestInputDto testInputDto){
        return testService.addTest(testInputDto);
    }
}
