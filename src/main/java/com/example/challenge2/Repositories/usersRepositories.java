package com.example.challenge2.Repositories;


import com.example.challenge2.Entites.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface usersRepositories extends MongoRepository<Users,String> {


    List<Users> findByFirstName(String firstName);


    List<Users> findByEmail(String email);
}


