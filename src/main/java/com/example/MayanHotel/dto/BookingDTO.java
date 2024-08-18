package com.example.MayanHotel.dto;

import com.example.MayanHotel.entity.Room;
import com.example.MayanHotel.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class BookingDTO {

    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numOfAdults;
    private int numOfKids;
    private int totalNumOfGuest;
    private String bookingConfirmCode;
    private RoomDTO room;
    private UserDTO roomUser;

}
