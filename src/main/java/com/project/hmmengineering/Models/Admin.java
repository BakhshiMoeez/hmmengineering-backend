package com.project.hmmengineering.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Admin {
    @Id
    private String _id;
    private String name;
    private String password;
}
