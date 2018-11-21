package uk.ac.belfastmet.character.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.service.DwarfService;

@Controller
@RequestMapping
public class ToyStoryController {

	@GetMapping("/tolkien")
	public String Tolkien(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		ArrayList<Dwarf> tolkienDwarfs = dwarfService.getTolkienDwarfs();
		
		model.addAttribute("pageTitle", "Tolkien!");
		model.addAttribute("tolkienDwarfs", tolkienDwarfs);
		
		return "tolkien";
	}
	
}
