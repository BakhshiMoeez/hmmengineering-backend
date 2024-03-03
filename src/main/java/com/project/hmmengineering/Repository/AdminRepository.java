package com.project.hmmengineering.Repository;

import com.project.hmmengineering.Models.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {
}
