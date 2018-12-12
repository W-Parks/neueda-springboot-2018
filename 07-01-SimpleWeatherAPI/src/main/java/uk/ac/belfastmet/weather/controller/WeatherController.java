package uk.ac.belfastmet.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping()
public class WeatherController {

	@GetMapping("")
	public String home() {
		return "home";
	}
	
	@GetMapping("/weather/{location}")
	public String belfast(@RequestParam("location") String location, Model model) {
		
		//build for belfast
		String belfastWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=belfast";
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class)
		model.addAttribute("todaysWeather",todaysWeather);
		
		return "weather";
	}
	
}
