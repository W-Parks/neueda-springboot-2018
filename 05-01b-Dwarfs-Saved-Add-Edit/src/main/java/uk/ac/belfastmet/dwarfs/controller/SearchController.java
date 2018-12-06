package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;

@Controller
@RequestMapping("")
public class SearchController {

	DwarfRepository dwarfRepository;
	
	public SearchController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer dwarfId, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("dwarfs", this.dwarfRepository.findByDwarfId(dwarfId));
		return "dwarf";
	}
	
	@PostMapping("/searchname")
	public String searchName(@RequestParam("name") String name, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("dwarfs", this.dwarfRepository.findByName(name));
		return "dwarf";
	}
	
	@GetMapping("/searchauthor")
	public String searchAuthor(@RequestParam("author") String author, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor(author));
		return "dwarf";
	}
	
	@GetMapping("/searchnameauthor")
	public String searchNameAuthor(@RequestParam("name") String name, @RequestParam("author") String author, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("dwarfs", this.dwarfRepository.findByNameAndAuthor(name, author));
		return "dwarf";
	}
}
