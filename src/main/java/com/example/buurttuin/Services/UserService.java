package com.example.buurttuin.Services;

import com.example.buurttuin.Dtos.*;
import com.example.buurttuin.Fields.Borrower;
import com.example.buurttuin.Fields.Lender;
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
    private final BorrowerRepository borrowerRepository;
    private final LenderRepository lenderRepository;

    @Autowired
    public UserService(UserRepository userRepository,
                       BorrowerRepository borrowerRepository,
                       LenderRepository lenderRepository) {
        this.userRepository = userRepository;
        this.borrowerRepository = borrowerRepository;
        this.lenderRepository = lenderRepository;
    }

    public UserDto addUser(UserInputDto userInputDto) {
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


    public UserDto addNewBorrowerToUser(Long borrowerId, Long userId){
        Borrower borrower = borrowerRepository.getById(borrowerId);
        User user = userRepository.getById(userId);

        borrower.assignUser(user);
        userRepository.save(user);
        return fromUser(user);

    }

    public UserDto addNewLenderToUser(Long lenderId, Long userId){
        Lender lender = lenderRepository.getById(lenderId);
        User user = userRepository.getById(userId);

        lender.assignUser(user);
        userRepository.save(user);
        return fromUser(user);

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

        dto.setBorrower(user.getBorrowers());
        dto.setLenders(user.getLenders());

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

        user.setBorrowers(userInputDto.getBorrowers());
        user.setLenders(userInputDto.getLenders());

        return user;
    }



}
