package uk.ac.belfastmet.TitanicCrud.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.TitanicCrud.domain.Passenger;
import uk.ac.belfastmet.TitanicCrud.repositories.PassengerRepository;

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

	@GetMapping("/add/")
	public String addPassenger(Model model) {
		
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("passenger", new Passenger());
		return "editPassengers";
	}
	
	@GetMapping("/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		
		model.addAttribute("pageTitle", "Edit");
		model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerId));
		return "editPassengers";
	}
	
	@PostMapping("/save")
	public String savePassenegr(@Valid Passenger passenger, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors())
		{
			return "editPassengers";
		}else {
			Passenger savePassenger = this.passengerRepository.save(passenger);
			return "redirect:/view/"+ passenger.getPassengerId();
		}
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
