package com.example.buurttuin.Controllers;

import com.example.buurttuin.Dtos.AdminDto;
import com.example.buurttuin.Dtos.AdminInputDto;
import com.example.buurttuin.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/add/admin")
    public AdminDto addTest (@RequestBody AdminInputDto adminInputDto){
        return adminService.addAdmin(adminInputDto);
    }
}
