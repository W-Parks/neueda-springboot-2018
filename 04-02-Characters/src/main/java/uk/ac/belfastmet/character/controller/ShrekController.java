package uk.ac.belfastmet.character.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.character.domain.Character;
import uk.ac.belfastmet.character.service.CharacterService;

@Controller
@RequestMapping
public class ShrekController {

	@GetMapping("/shrek")
	public String Shrek(Model model) {
		
		CharacterService characterService = new CharacterService();
		ArrayList<Character> characterDwarfs = characterService.getShrekCharacters();
		
		model.addAttribute("pageTitle", "Shrek!");
		model.addAttribute("shrekCharacter", shrekCharacter);
		return "shrek";
	}
	
}
