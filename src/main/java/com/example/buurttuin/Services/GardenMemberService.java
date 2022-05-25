package com.example.buurttuin.Services;

import com.example.buurttuin.Dtos.*;
import com.example.buurttuin.Exceptions.RecordNotFoundException;
import com.example.buurttuin.Fields.GardenMember;
import com.example.buurttuin.Fields.User;
import com.example.buurttuin.Repositorys.GardenMemberRepository;
import com.example.buurttuin.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GardenMemberService {

   private final GardenMemberRepository gardenMemberRepository;

    @Autowired
    public GardenMemberService(GardenMemberRepository gardenMemberRepository) {
        this.gardenMemberRepository = gardenMemberRepository;
    }

    public GardenMemberDto addGardenMember(GardenMemberInputDto gardenMemberInputDto) {
        GardenMember gardenMember = toGardenMember(gardenMemberInputDto);
        gardenMemberRepository.save(gardenMember);
        return fromGardenMember(gardenMember);
    }

    public static GardenMemberDto fromGardenMember (GardenMember gardenMember){
        var dto = new GardenMemberDto();

        dto.setId(gardenMember.getId());
        return dto;
    }

    public static GardenMember toGardenMember (GardenMemberInputDto gardenMemberInputDto){
        var gardenMember = new GardenMember();

        gardenMemberInputDto.setId(gardenMemberInputDto.getId());
        return gardenMember;
    }
}
