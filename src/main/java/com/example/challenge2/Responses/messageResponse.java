package com.example.challenge2.Responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class messageResponse {

    private String message;

    public messageResponse(String message) {
        this.message = message;
    }
}
