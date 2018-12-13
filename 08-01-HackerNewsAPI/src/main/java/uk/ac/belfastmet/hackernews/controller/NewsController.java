package uk.ac.belfastmet.hackernews.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


@Controller
@RequestMapping()
public class NewsController {
	
	@GetMapping("")
	public String hackerNews(Model model) {
		
		String newsUrl = "https://hacker-news.firebaseio.com/v0/topstories.json";
		RestTemplate restTemplate = new RestTemplate();
		ArrayList<Integer> topStories = restTemplate.getForObject(newsUrl, ArrayList.class);
		
		model.addAttribute("news", topStories);
		return "index";	//index.html
	}
}
