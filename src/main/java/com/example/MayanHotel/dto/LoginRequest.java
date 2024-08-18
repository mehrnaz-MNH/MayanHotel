package com.example.MayanHotel.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank(message ="email should be provided")
    private String email;
    @NotBlank(message ="password should be provided")
    private String password;
}
