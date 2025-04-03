package edu.du.ticketreservation.dto;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Ticket {
    private Long tId ;
    private String rSpot;

    private String uName;

    private String pTitle;
    private String pPlace;
    private Date pDate;
}
