package com.example.buurttuin.Services;

import com.example.buurttuin.Dtos.BorrowerDto;
import com.example.buurttuin.Dtos.BorrowerInputDto;
import com.example.buurttuin.Exceptions.RecordNotFoundException;
import com.example.buurttuin.Fields.Borrower;
import com.example.buurttuin.Fields.User;
import com.example.buurttuin.Repositorys.BorrowerRepository;

import com.example.buurttuin.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BorrowerService {

    private final BorrowerRepository borrowerRepository;
    private final UserRepository userRepository;

    @Autowired
    public BorrowerService(BorrowerRepository borrowerRepository, UserRepository userRepository) {
        this.borrowerRepository = borrowerRepository;
        this.userRepository = userRepository;
    }

    public BorrowerDto addBorrower(BorrowerInputDto borrowerInputDto) {
        Borrower borrower = toBorrower(borrowerInputDto);
        borrowerRepository.save(borrower);
        return fromBorrower(borrower);
    }

    public BorrowerDto assignBorrowerToUser (Long borrowerId, long userId) throws RecordNotFoundException {
        Optional<Borrower> optionalBorrower = borrowerRepository.findById(borrowerId);
        Optional<User> optionalUser = userRepository.findById(userId);

        Borrower borrower;
        if(optionalBorrower.isEmpty() || optionalUser.isEmpty()){
            throw new RecordNotFoundException();
        }else {
            borrower = optionalBorrower.get();
            User user = optionalUser.get();

            borrower.setUser(user);
            borrowerRepository.save(borrower);
        }
        return fromBorrower(borrower);
    }



    public static BorrowerDto fromBorrower (Borrower borrower){
        var dto = new BorrowerDto();

        dto.setId(borrower.getId());

        dto.setUser(borrower.getUser());
        dto.setReservations(borrower.getReservations());
        return dto;
    }

    public static Borrower toBorrower (BorrowerInputDto borrowerInputDto){
        var borrower = new Borrower();

        borrower.setId(borrowerInputDto.getId());

        borrower.setUser(borrowerInputDto.getUser());
        borrower.setReservations(borrowerInputDto.getReservations());
        return borrower;
    }



}

