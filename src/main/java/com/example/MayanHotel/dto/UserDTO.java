package com.example.MayanHotel.dto;

import com.example.MayanHotel.entity.Booking;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long id;
    private String email;
    private String name ;
    private String phoneNumber ;
    private String password;
    private String role;
    private List<BookingDTO> bookings = new ArrayList<>() ;

}
