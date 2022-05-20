package com.example.buurttuin.Services;

import com.example.buurttuin.Dtos.*;
import com.example.buurttuin.Fields.Admin;
import com.example.buurttuin.Fields.Test;
import com.example.buurttuin.Fields.User;
import com.example.buurttuin.Repositorys.BorrowerRepository;
import com.example.buurttuin.Repositorys.LenderRepository;
import com.example.buurttuin.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final LenderRepository lenderRepository;
    private final BorrowerRepository borrowerRepository;

    @Autowired
    public UserService(UserRepository userRepository,
                       LenderRepository lenderRepository,
                       BorrowerRepository borrowerRepository) {
        this.userRepository = userRepository;
        this.lenderRepository = lenderRepository;
        this.borrowerRepository = borrowerRepository;
    }

    public UserDto addTest(UserInputDto userInputDto) {
        User user = toUser(userInputDto);
        userRepository.save(user);
        return fromUser(user);
    }

    public List<UserDto> getAllUsers() {
        List<UserDto> userDtos = new ArrayList<>();
        List<User> users = userRepository.findAll();
        for (User user : users) {
            userDtos.add(fromUser(user));
        }
        return userDtos;
    }

    public static UserDto fromUser (User user){
        var dto = new UserDto();

        dto.setId(user.getId());
        dto.setUserName(user.getUserName());
        dto.setPassword(user.getPassword());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setZipcode(user.getZipcode());
        dto.setStreetName(user.getStreetName());
        dto.setHouseNumber(user.getHouseNumber());
        dto.setEmail(user.getEmail());

        return dto;
    }

    public static User toUser (UserInputDto userInputDto){
        var user = new User();

        user.setId(userInputDto.getId());
        user.setUserName(userInputDto.getUserName());
        user.setPassword(userInputDto.getPassword());
        user.setFirstName(userInputDto.getFirstName());
        user.setLastName(userInputDto.getLastName());
        user.setZipcode(userInputDto.getZipcode());
        user.setStreetName(userInputDto.getStreetName());
        user.setHouseNumber(userInputDto.getHouseNumber());
        user.setEmail(userInputDto.getEmail());

        return user;
    }



}
