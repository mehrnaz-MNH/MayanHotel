package com.example.MayanHotel.dto;

import com.example.MayanHotel.entity.Room;
import com.example.MayanHotel.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
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
