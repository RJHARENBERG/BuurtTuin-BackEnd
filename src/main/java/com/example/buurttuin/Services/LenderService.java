package com.example.buurttuin.Services;

import com.example.buurttuin.Dtos.*;
import com.example.buurttuin.Dtos.LenderDto;
import com.example.buurttuin.Dtos.LenderInputDto;
import com.example.buurttuin.Exceptions.RecordNotFoundException;
import com.example.buurttuin.Fields.Lender;
import com.example.buurttuin.Fields.Lender;
import com.example.buurttuin.Fields.Test;
import com.example.buurttuin.Fields.User;
import com.example.buurttuin.Repositorys.LenderRepository;
import com.example.buurttuin.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LenderService {

   private final LenderRepository lenderRepository;
   private final UserRepository userRepository;

    @Autowired
    public LenderService(LenderRepository lenderRepository,
                         UserRepository userRepository) {
        this.lenderRepository = lenderRepository;
        this.userRepository = userRepository;
    }

    public LenderDto addLender(LenderInputDto lenderInputDto) {
        Lender lender = toLender(lenderInputDto);
        lenderRepository.save(lender);
        return fromLender(lender);
    }

    public LenderDto assignLenderToUser (Long lenderId, long userId) throws RecordNotFoundException {
        Optional<Lender> optionalLender = lenderRepository.findById(lenderId);
        Optional<User> optionalUser = userRepository.findById(userId);

        Lender lender;
        if(optionalLender.isEmpty() || optionalUser.isEmpty()){
            throw new RecordNotFoundException();
        }else {
            lender = optionalLender.get();
            User user = optionalUser.get();

//            user.setLender(lender);
            lender.setUser(user);
            lenderRepository.save(lender);
        }
        return fromLender(lender);
    }

    public static LenderDto fromLender (Lender lender){
        var dto = new LenderDto();

        dto.setId(lender.getId());
        dto.setUser(lender.getUser());
        dto.setReservations(lender.getReservations());
        dto.setTools(lender.getTools());
        return dto;
    }

    public static Lender toLender (LenderInputDto lenderInputDto){
        var lender = new Lender();

        lender.setId(lenderInputDto.getId());
        lender.setUser(lenderInputDto.getUser());
        lender.setReservations(lenderInputDto.getReservations());
        lender.setTools(lenderInputDto.getTools());
        return lender;
    }



}
