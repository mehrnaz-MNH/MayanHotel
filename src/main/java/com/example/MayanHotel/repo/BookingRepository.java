package com.example.MayanHotel.repo;

import com.example.MayanHotel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findBookingByConfirmCode(String ConfirmationCode);
}
