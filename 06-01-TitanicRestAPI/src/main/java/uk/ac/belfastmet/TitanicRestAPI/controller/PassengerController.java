package uk.ac.belfastmet.TitanicRestAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.TitanicRestAPI.domain.Passenger;
import uk.ac.belfastmet.TitanicRestAPI.repository.PassengerRepository;

@RestController
@RequestMapping("")
public class PassengerController {

	@Autowired
	PassengerRepository passengerRepository;
	
	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@GetMapping("passengers")
	public Iterable<Passenger> getAllPassengers() {
		
		return this.passengerRepository.findAll();
	}

	@GetMapping("passengers/{passengerId}")
	public Passenger getPassenger(@PathVariable("passengerId") Integer passengerId) {
		
		return this.passengerRepository.findByPassengerId(passengerId);
	}
		
	
	
}
