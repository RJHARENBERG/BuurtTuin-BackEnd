package com.example.buurttuin.Services;

import com.example.buurttuin.Dtos.TestDto;
import com.example.buurttuin.Dtos.TestInputDto;
import com.example.buurttuin.Models.Test;
import com.example.buurttuin.Repositorys.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public TestDto addTest(TestInputDto testInputDto) {
        Test test = toTest(testInputDto);
        testRepository.save(test);
        return fromTest(test);
    }


    public static TestDto fromTest (Test test){
        var dto = new TestDto();

        dto.setTest(test.getTest());
        return dto;
    }

    public static Test toTest (TestInputDto testInputDto){
         var test = new Test();

         test.setTest(testInputDto.getTest());
         return test;
    }



}
