package uk.ac.belfastmet.TitanicCrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

	@GetMapping("/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "View");
		model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerId));
		return "viewPassengers";
	}
	
	@GetMapping("/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId, Model model, RedirectAttributes redirectAttributes) {
		
		this.passengerRepository.deleteById(passengerId);
		redirectAttributes.addFlashAttribute("message", "Passenger Deleted Successfully");
		return "redirect:/passengers";
	}
	
}
