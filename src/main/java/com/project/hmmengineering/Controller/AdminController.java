package com.project.hmmengineering.Controller;

import com.project.hmmengineering.Models.Admin;
import com.project.hmmengineering.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @Autowired
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/Hello")
    public String Hello() {
        return "Hello";
    }

    @GetMapping("/getAll")
    public List<Admin> getAdminData() {
        return adminService.getAdminData();
    }

    @GetMapping("/createUser/{name}/{password}/{secretKey}")
    public String createAdminUser(@PathVariable String name, @PathVariable String password, @PathVariable String secretKey) {
        if (System.getenv("SECRET_KEY").equals(secretKey)) {
            return adminService.createAdminUser(name, password);
        }
        return "UnAuntherized";
    }
}
