package uk.ac.belfastmet.TitanicCrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.TitanicCrud.repository.PassengerRepository;

@Controller
@RequestMapping
public class PassengerController {

	PassengerRepository passengerRepository;

	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("/passengers")
	public String Passenger(Model model) {
		model.addAttribute("pageTitle","Passengers");
		model.addAttribute("passengers",this.passengerRepository.findAll());
		return "passengersPage";
	}
	
	
}
