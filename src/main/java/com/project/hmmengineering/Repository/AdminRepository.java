package com.project.hmmengineering.Repository;

import com.project.hmmengineering.Models.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AdminRepository extends MongoRepository<Admin, String> {
     Optional<Admin> findByName(String name);
}
