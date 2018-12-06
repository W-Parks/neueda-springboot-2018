package uk.ac.belfastmet.TitanicCrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.TitanicCrud.repository.PassengerRepository;

@Controller
@RequestMapping("")
public class SearchController {
	
	PassengerRepository passengerRepository;

	public SearchController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer passengerId, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findByPassengerId(passengerId));
		return "passengersPage";
	}
	
	@PostMapping("/searchname")
	public String searchName(@RequestParam("name") String name, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("dwarfs", this.passengerRepository.findByNameContaining(name));
		return "passengersPage";
	}
	
	@GetMapping("/searchsurvived")
	public String searchSurvived(@RequestParam("survived") Boolean survived, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findBySurvived(survived));
		return "passengersPage";
	}
	
	@GetMapping("/searchsex")
	public String searchSex(@RequestParam("sex") String sex, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findBySex(sex));
		return "passengersPage";
	}
	
	@GetMapping("/searchembarked")
	public String searchEmbarked(@RequestParam("embarked") String embarked, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findByEmbarked(embarked));
		return "passengersPage";
	}
	
}
