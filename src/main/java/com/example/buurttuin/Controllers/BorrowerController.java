package com.example.buurttuin.Controllers;

import com.example.buurttuin.Dtos.BorrowerDto;
import com.example.buurttuin.Dtos.BorrowerInputDto;
import com.example.buurttuin.Dtos.LenderDto;
import com.example.buurttuin.Exceptions.RecordNotFoundException;
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

    @PutMapping("borrower/{borrower_id}/user/{user_id}")
    public BorrowerDto assignBorrowerToUser(@PathVariable Long borrower_id,
                                        @PathVariable Long user_id) throws RecordNotFoundException {
        return borrowerService.assignBorrowerToUser(borrower_id, user_id);
    }
}




