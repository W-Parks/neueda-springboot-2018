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
		model.addAttribute("dwarfs", this.passengerRepository.findByName(name));
		return "passengersPage";
	}
	
	@GetMapping("/searchsurvived")
	public String searchSurvived(@RequestParam("survived") Boolean survived, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findBySurvived(survived));
		return "passengersPage";
	}
	
	@GetMapping("/searchpclass")
	public String searchPClass(@RequestParam("pclass") Integer pClass, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findByPClass(pClass));
		return "passengersPage";
	}
	
	@GetMapping("/searchsex")
	public String searchSex(@RequestParam("sex") String sex, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findBySex(sex));
		return "passengersPage";
	}
	
	@GetMapping("/searchage")
	public String searchAge(@RequestParam("age") Integer age, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findByAge(age));
		return "passengersPage";
	}
	
	@GetMapping("/searchsibsp")
	public String searchSibSp(@RequestParam("sibsp") Integer sibSp, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findBySibSp(sibSp));
		return "passengersPage";
	}
	
	@GetMapping("/searchparch")
	public String searchParch(@RequestParam("parch") Integer parch, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findByParch(parch));
		return "passengersPage";
	}
	
	@GetMapping("/searchticket")
	public String searchTicket(@RequestParam("ticket") String ticket, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findByTicket(ticket));
		return "passengersPage";
	}
	
	@GetMapping("/searchfare")
	public String searchFare(@RequestParam("fare") Double fare, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findByFare(fare));
		return "passengersPage";
	}
	
	@GetMapping("/searchcabin")
	public String searchCabin(@RequestParam("cabin") String cabin, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findByCabin(cabin));
		return "passengersPage";
	}
	
	@GetMapping("/searchembarked")
	public String searchEmbarked(@RequestParam("embarked") String embarked, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passengers", this.passengerRepository.findByEmbarked(embarked));
		return "passengersPage";
	}
	
}
