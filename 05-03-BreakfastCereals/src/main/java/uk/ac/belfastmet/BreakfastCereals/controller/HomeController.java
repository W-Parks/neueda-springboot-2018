package uk.ac.belfastmet.BreakfastCereals.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.BreakfastCereals.repositories.CerealRepository;
import uk.ac.belfastmet.BreakfastCereals.domain.Cereal;

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
	
	@GetMapping("/cereal")
	public String Cereal(Model model) {
		model.addAttribute("pageTitle","Cereals");
		model.addAttribute("cereal",this.cerealRepository.findAll());
		return "cerealPage";
	}
	
	@GetMapping("/add/")
	public String addCereal(Model model) {
		
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("cereal", new Cereal());
		return "editCereal";
	}
	
	@GetMapping("/edit/{cerealId}")
	public String editCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		
		model.addAttribute("pageTitle", "Edit");
		model.addAttribute("cereal", this.cerealRepository.findByCerealId(cerealId));
		return "editCereal";
	}
	
	@PostMapping("/save")
	public String saveCereal(@Valid Cereal cereal, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors())
		{
			return "editCereal";
		}else {
			Cereal saveCereal = this.cerealRepository.save(cereal);
			return "redirect:/view/"+ cereal.getCerealId();
		}
	}
	
	@GetMapping("/view/{cerealId}")
	public String viewCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "View");
		model.addAttribute("cereal", this.cerealRepository.findByCerealId(cerealId));
		return "viewCereal";
	}
	
	@GetMapping("/delete/{cerealId}")
	public String deleteCereal(@PathVariable("cerealId") Integer cerealId, Model model, RedirectAttributes redirectAttributes) {
		
		this.cerealRepository.deleteById(cerealId);
		redirectAttributes.addFlashAttribute("message", "Cereal Deleted Successfully");
		return "redirect:/cereal";
	}
	
	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer cerealId, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("cereal", this.cerealRepository.findByCerealId(cerealId));
		return "cerealPage";
	}
	
	@PostMapping("/searchcerealname")
	public String searchCereal(@RequestParam("cerealname") String cereal, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("cereal", this.cerealRepository.findByCerealContaining(cereal));
		return "cerealPage";
	}
	
	@GetMapping("/searchmanufacturer")
	public String searchManufacturer(@RequestParam("manufacturer") String manufacturer, Model model) {		
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("cereal", this.cerealRepository.findBymanufacturer(manufacturer));
		return "cerealPage";
	}
	
}
