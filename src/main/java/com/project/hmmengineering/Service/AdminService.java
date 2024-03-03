package com.project.hmmengineering.Service;

import com.project.hmmengineering.Models.Admin;
import com.project.hmmengineering.Repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    public List<Admin> getAdminData() {
        return adminRepository.findAll();
    }

    public String createAdminUser(String name, String password){
        Admin admin = Admin.builder().name(name).password(password).build();
        System.out.println(admin);
        adminRepository.save(admin);
        return "User Created";
    }
}
