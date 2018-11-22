package uk.ac.belfastmet.character.service;

import java.util.ArrayList;

import uk.ac.belfastmet.character.domain.Character;

public class CharacterService {

	public CharacterService(){
		super();
	}
	
	public ArrayList<Character> getShrekCharacters(){
		
		ArrayList<Character> characters = new ArrayList<Character>();
		
		Character shrek = new Character("Shrek","Shrek","shrek.png");
		characters.add(shrek);
		Character donkey = new Character("Donkey","Shrek","donkey.png");
		characters.add(donkey);
		Character puss = new Character("Puss in Boots","Shrek","pusspng");
		characters.add(puss);
		Character fiona = new Character("Fiona","Shrek","fiona.png");
		characters.add(fiona);
		
		return characters;
		
	}
	
	public ArrayList<Character> getToyStoryCharacters(){
		
		ArrayList<Character> characters = new ArrayList<Character>();
		
		Character woody = new Character("Woody","Toy Story","woody.png");
		characters.add(woody);
		Character buzz= new Character("Buzz Lightyear","Toy Story","buzz.png");
		characters.add(buzz);
		Character rex = new Character("Rex","Toy Story","rex.png");
		characters.add(rex);
		Character hamm = new Character("Hamm","Toy Story","hamm.png");
		characters.add(hamm);
		
		return characters;
		
	}
	
}
