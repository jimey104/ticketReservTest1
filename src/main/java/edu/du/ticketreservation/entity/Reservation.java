package edu.du.ticketreservation.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rId;

    @Column(name = "r_spot", nullable = false, length = 255)
    private String rSpot;
    @Column(name = "r_spotStatus", nullable = false, length = 255)
    private String rSpotStatus;

    @Column(name = "r_phone", nullable = false, length = 255)
    private String rPhone;

    @Column(name = "r_email", nullable = false, length = 255)
    private String rEmail;

    @Column(name = "r_time", nullable = false)
    private LocalDateTime rTime;


    // user data
    @Column(name = "u_name", nullable = false, length = 255)
    private String uName;
    @Column(name = "u_id", nullable = false, length = 255)
    private Long uId;


    // performance data
    @Column(name = "p_id", nullable = false)
    private Long pId;

    @Column(name = "p_date", nullable = false)
    private Date pDate;

    @Column(name = "p_place", nullable = false, length = 255)
    private String pPlace;

    @Column(name = "p_price", nullable = false)
    private int pPrice;
}
