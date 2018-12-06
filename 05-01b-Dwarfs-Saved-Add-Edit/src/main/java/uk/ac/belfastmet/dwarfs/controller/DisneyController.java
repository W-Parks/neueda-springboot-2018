package uk.ac.belfastmet.dwarfs.controller;

//import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import uk.ac.belfastmet.dwarfs.domain.Dwarf;
//import uk.ac.belfastmet.dwarfs.service.DwarfService;
import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;

@Controller
@RequestMapping
public class DisneyController {

	DwarfRepository dwarfRepository;
		
	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("/disney")
	public String Disney(Model model) {
		
		model.addAttribute("pageTitle", "Disney");		
		//DwarfService dwarfService = new DwarfService();				
		//model.addAttribute("disneyDwarfs", disneyDwarfs);
		model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor("Disney"));
		return "dwarf";
	}
	
}
