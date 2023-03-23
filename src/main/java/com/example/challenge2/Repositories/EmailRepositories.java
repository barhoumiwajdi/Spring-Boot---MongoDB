package com.example.challenge2.Repositories;

import com.example.challenge2.Entites.EmailDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.mail.SimpleMailMessage;

public interface EmailRepositories extends MongoRepository<EmailDetails , String> {


    String sendSimpleMail(EmailDetails details);

    String send(SimpleMailMessage mailMessage);
}
