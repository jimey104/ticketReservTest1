package edu.du.ticketreservation.repository;

import edu.du.ticketreservation.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservReposi extends JpaRepository<Reservation, Long> {
}
