package com.example.challenge2.Entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document (collection = "Users")
public class Users {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Integer age;


}
