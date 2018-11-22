package uk.ac.belfastmet.character.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.character.domain.Character;
import uk.ac.belfastmet.character.service.CharacterService;;

@Controller
@RequestMapping
public class ToyStoryController {

	@GetMapping("/toystory")
	public String ToyStory(Model model) {
		
		CharacterService characterService = new CharacterService();
		ArrayList<Character> toyStoryCharacters = characterService.getToyStoryCharacters();
		
		model.addAttribute("pageTitle", "Toy Story");
		model.addAttribute("toyStoryCharacters", toyStoryCharacters);
		
		return "toystory";
	}
	
}
