package com.example.buurttuin.Services;

import com.example.buurttuin.Dtos.*;
import com.example.buurttuin.Exceptions.RecordNotFoundException;
import com.example.buurttuin.Fields.GardenMember;
import com.example.buurttuin.Fields.User;
import com.example.buurttuin.Repositorys.GardenMemberRepository;
import com.example.buurttuin.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GardenMemberService {

   private final GardenMemberRepository gardenMemberRepository;
   private final UserRepository userRepository;

    @Autowired
    public GardenMemberService(GardenMemberRepository gardenMemberRepository,
                               UserRepository userRepository) {
        this.gardenMemberRepository = gardenMemberRepository;
        this.userRepository = userRepository;
    }

    public GardenMemberDto addGardenMember(GardenMemberInputDto gardenMemberInputDto) {
        GardenMember gardenMember = toGardenMember(gardenMemberInputDto);
        gardenMemberRepository.save(gardenMember);
        return fromGardenMember(gardenMember);
    }

    public GardenMemberDto assignGardenMemberToUser (Long gardenMemberId, long userId) throws RecordNotFoundException {
        Optional<GardenMember> optionalGardenMember = gardenMemberRepository.findById(gardenMemberId);
        Optional<User> optionalUser = userRepository.findById(userId);

        GardenMember gardenMember;
        if(optionalGardenMember.isEmpty() || optionalUser.isEmpty()){
            throw new RecordNotFoundException();
        }else {
            gardenMember = optionalGardenMember.get();
            User user = optionalUser.get();

            gardenMember.setUser(user);
            gardenMemberRepository.save(gardenMember);
        }
        return fromGardenMember(gardenMember);
    }


    public static GardenMemberDto fromGardenMember (GardenMember gardenMember){
        var dto = new GardenMemberDto();

        dto.setId(gardenMember.getId());
        dto.setUser(gardenMember.getUser());
        return dto;
    }

    public static GardenMember toGardenMember (GardenMemberInputDto gardenMemberInputDto){
        var gardenMember = new GardenMember();

        gardenMemberInputDto.setId(gardenMemberInputDto.getId());
        gardenMemberInputDto.setUser(gardenMemberInputDto.getUser());
        return gardenMember;
    }







}
