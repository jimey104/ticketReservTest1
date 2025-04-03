package edu.du.ticketreservation.service;

import edu.du.ticketreservation.dto.Ticket;
import edu.du.ticketreservation.entity.Reservation;
import edu.du.ticketreservation.repository.ReservReposi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservService {
    private final ReservReposi reservReposi;

    public Ticket getTicket(Long rId) {
        Optional<Reservation> reservation = reservReposi.findById(rId);
        return reservation.map(res -> Ticket.builder()
                .tId(res.getRId())
                .rSpot(res.getRSpot())
                .uName(res.getUName())
                .pTitle("Test Performance")// 테스트 데이터
                .pPlace(res.getPPlace())
                .pDate(res.getPDate())
                .build()).orElse(null);
    }
}
