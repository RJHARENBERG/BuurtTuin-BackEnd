package com.example.buurttuin.Services;

import com.example.buurttuin.Dtos.LenderDto;
import com.example.buurttuin.Dtos.LenderInputDto;
import com.example.buurttuin.Fields.Lender;
import com.example.buurttuin.Repositorys.LenderRepository;
import com.example.buurttuin.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LenderService {

   private final LenderRepository lenderRepository;

    @Autowired
    public LenderService(LenderRepository lenderRepository,
                         UserRepository userRepository) {
        this.lenderRepository = lenderRepository;
    }

    public LenderDto addLender(LenderInputDto lenderInputDto) {
        Lender lender = toLender(lenderInputDto);
        lenderRepository.save(lender);
        return fromLender(lender);
    }


    public static LenderDto fromLender (Lender lender){
        var dto = new LenderDto();

        dto.setId(lender.getId());
        return dto;
    }

    public static Lender toLender (LenderInputDto lenderInputDto){
        var lender = new Lender();

        lender.setId(lenderInputDto.getId());
        return lender;
    }
}
