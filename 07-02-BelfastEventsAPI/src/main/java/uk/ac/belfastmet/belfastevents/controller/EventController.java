package uk.ac.belfastmet.belfastevents.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.belfastevents.domain.AllEvents;

@Controller
@RequestMapping()
public class EventController {

	@GetMapping("")
	public String home() {
		return "homePage";
	}
	
	@GetMapping("/events")
	public String belfastEvents(Model model) {
		
		String eventUrl = "https://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		AllEvents event = restTemplate.getForObject(eventUrl, AllEvents.class);
		//System.out.println(event.getAllEvents());
//		//slf4j
//		Logger logger = LoggerFactory.getLogger(AllEvents.class);
//		logger.info(event.getAllEvents().toString());
		
		model.addAttribute("events", event.getAllEvents());
		return "events";	//events.html
	}
	
}
