package uk.ac.belfastmet.BreakfastCereals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.BreakfastCereals.repositories.CerealRepository;

@Controller
@RequestMapping
public class HomeController {
	
	CerealRepository cerealRepository;
	
	public HomeController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}

	@GetMapping("")
	public String home(Model model) {
		return "homePage";
	}
	
}
