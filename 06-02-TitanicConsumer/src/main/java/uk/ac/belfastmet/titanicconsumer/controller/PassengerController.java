package uk.ac.belfastmet.titanicconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;
import uk.ac.belfastmet.titanicconsumer.service.PassengerService;

@Controller
@RequestMapping("/titanic")
public class PassengerController {
	
	@Autowired
	PassengerService passengerService;
	AllPassengers allPassengers;
	
	public PassengerController(PassengerService passengerService, AllPassengers allPassengers) {
		super();
		this.passengerService = passengerService;
		this.allPassengers = allPassengers;
	}
	
	@GetMapping("/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		
		model.addAttribute("pageTitle", "View Passenger");
		
		Passenger passenger = this.passengerService.get(passengerId);
		model.addAttribute("passenger", passenger);
		return "viewPassenger";
	}
	
	
}
