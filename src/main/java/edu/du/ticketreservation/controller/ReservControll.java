package edu.du.ticketreservation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reserve")
public class ReservControll {

    @GetMapping
    public String reserve() {
        return "Reservation Controll";
    }

}
