package uk.ac.belfastmet.largestbuilding.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestbuilding.domain.Volume;
import uk.ac.belfastmet.largestbuilding.service.BuildingService;

@Controller
@RequestMapping
public class VolumeController {

	@GetMapping("/volume")
	public String volume(Model model) {
		
		BuildingService buildingService = new BuildingService();
		
		ArrayList<Volume> largestByVolume = buildingService.getVolume();
		model.addAttribute("largestByVolume", largestByVolume);
				
		return "volume.html";
	}
	
}
