package com.example.buurttuin.Services;

import com.example.buurttuin.Dtos.BorrowerDto;
import com.example.buurttuin.Dtos.BorrowerInputDto;
import com.example.buurttuin.Fields.Borrower;
import com.example.buurttuin.Repositorys.BorrowerRepository;

import com.example.buurttuin.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowerService {

    private final BorrowerRepository borrowerRepository;

    @Autowired
    public BorrowerService(BorrowerRepository borrowerRepository, UserRepository userRepository) {
        this.borrowerRepository = borrowerRepository;
    }

    public BorrowerDto addBorrower(BorrowerInputDto borrowerInputDto) {
        Borrower borrower = toBorrower(borrowerInputDto);
        borrowerRepository.save(borrower);
        return fromBorrower(borrower);
    }



    public static BorrowerDto fromBorrower (Borrower borrower){
        var dto = new BorrowerDto();

        dto.setId(borrower.getId());

        return dto;
    }

    public static Borrower toBorrower (BorrowerInputDto borrowerInputDto){
        var borrower = new Borrower();

        borrower.setId(borrowerInputDto.getId());

        return borrower;
    }



}

