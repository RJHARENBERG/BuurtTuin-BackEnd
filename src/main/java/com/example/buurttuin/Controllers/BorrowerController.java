package com.example.buurttuin.Controllers;

import com.example.buurttuin.Dtos.BorrowerDto;
import com.example.buurttuin.Dtos.BorrowerInputDto;
import com.example.buurttuin.Services.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrowerController {

    private final BorrowerService borrowerService;

    @Autowired
    public BorrowerController(BorrowerService borrowerService) {
        this.borrowerService = borrowerService;
    }

    @PostMapping("/add/borrower")
    public BorrowerDto addBorrower (@RequestBody BorrowerInputDto borrowerInputDto){
        return borrowerService.addBorrower(borrowerInputDto);
    }
}




