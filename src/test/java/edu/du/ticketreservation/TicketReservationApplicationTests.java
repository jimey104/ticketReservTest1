package edu.du.ticketreservation;

import edu.du.ticketreservation.dto.Ticket;
import edu.du.ticketreservation.entity.Reservation;
import edu.du.ticketreservation.repository.ReservReposi;
import edu.du.ticketreservation.service.ReservService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Date;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TicketReservationApplicationTests {

    @Autowired
    private ReservReposi reservReposi;

    @Autowired
    private ReservService reservService;

    private Ticket ticket;

    @Test
    public void testCreateReservation() {
        String rSpot = "A1";
        String rSpotStatus = "Available";
        String rPhone = "010-1234-5678";
        String rEmail = "test@example.com";




        Reservation reservation = Reservation.builder()
                .rSpot(rSpot)
                .rSpotStatus(rSpotStatus)
                .rPhone(rPhone)
                .rEmail(rEmail)
                .pDate(new Date(125, 3, 2, 14, 30))
                .uName("홍길동")
                .uId(11L)
                .pId(11111L)
                .rTime(LocalDateTime.now().plusDays(1))
                .pPlace("서울 공연장")
                .pPrice(50000)
                .build();

        Reservation savedReservation = reservReposi.save(reservation);
        assertThat(savedReservation.getRId()).isNotNull();

        ticket = reservService.getTicket(savedReservation.getRId());
        System.out.println("\n===\n"+ticket+"\n-------\n여기 출력됌\n===\n");
    }
}
