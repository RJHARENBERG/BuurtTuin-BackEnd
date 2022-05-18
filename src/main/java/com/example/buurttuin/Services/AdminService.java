package com.example.buurttuin.Services;

import com.example.buurttuin.Dtos.AdminDto;
import com.example.buurttuin.Dtos.AdminInputDto;
import com.example.buurttuin.Dtos.TestDto;
import com.example.buurttuin.Dtos.TestInputDto;
import com.example.buurttuin.Fields.Admin;
import com.example.buurttuin.Fields.Test;
import com.example.buurttuin.Repositorys.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public static AdminDto addAdmin(AdminInputDto adminInputDto) {
        Admin admin = toAdmin(adminInputDto);
        adminRepository.save(admin);
        return fromAdmin(admin);
    }

    public static AdminDto fromAdmin (Admin admin){
        var dto = new AdminDto();

        dto.setId(admin.getId());
        return dto;
    }

    public static Admin toAdmin (AdminInputDto adminInputDto){
        var admin = new Admin();

        admin.setId(adminInputDto.getId());
        return admin;
    }
}
