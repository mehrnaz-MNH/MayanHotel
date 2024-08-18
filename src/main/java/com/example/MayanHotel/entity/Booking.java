package com.example.MayanHotel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@Entity
@Table(name="booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message="check in date should be provided")
    private LocalDate checkInDate;
    @Future(message = "check out date should be in future")
    private LocalDate checkOutDate;
    @Min(value=1 , message="Number of adults can't be less than one")
    private int numOfAdults;
    @Min(value=0 , message="Number of kids can't be less than zero")
    private int numOfKids;

    @Transient
    private int totalNumOfGuest;
    @Column(unique = true)
    private String bookingConfirmCode;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="room_id")
    private Room room;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User roomUser;

    public Booking(Long id, LocalDate checkInDate, LocalDate checkOutDate, int numOfAdults, int numOfKids, String bookingConfirmCode, Room room, User roomUser) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numOfAdults = numOfAdults;
        this.numOfKids = numOfKids;
        this.bookingConfirmCode = bookingConfirmCode;
        this.room = room;
        this.roomUser = roomUser;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getNumOfAdults() {
        return numOfAdults;
    }

    public void setNumOfAdults(int numOfAdults) {
        this.numOfAdults = numOfAdults;
    }

    public int getNumOfKids() {
        return numOfKids;
    }

    public void setNumOfKids(int numOfKids) {
        this.numOfKids = numOfKids;
    }

    public int getTotalNumOfGuest() {
        return  this.numOfAdults + this.numOfKids;
    }



    public String getBookingConfirmCode() {
        return bookingConfirmCode;
    }

    public void setBookingConfirmCode(String bookingConfirmCode) {
        this.bookingConfirmCode = bookingConfirmCode;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getRoomUser() {
        return roomUser;
    }

    public void setRoomUser(User roomUser) {
        this.roomUser = roomUser;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", numOfAdults=" + numOfAdults +
                ", numOfKids=" + numOfKids +
                ", totalNumOfGuest=" + totalNumOfGuest +
                ", bookingConfirmCode='" + bookingConfirmCode + '\'' +
                ", room=" + room +
                ", roomUser=" + roomUser +
                '}';
    }
}

