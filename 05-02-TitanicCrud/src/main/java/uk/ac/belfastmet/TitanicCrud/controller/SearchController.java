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
	public String searchId(@RequestParam("id") Integer dwarfId, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findByPassengerId(passengerId));
		return "passengers";
	}
	
	@PostMapping("/searchname")
	public String searchName(@RequestParam("name") String name, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("dwarfs", this.passengerRepository.findByName(name));
		return "passenegrs";
	}
	
}
