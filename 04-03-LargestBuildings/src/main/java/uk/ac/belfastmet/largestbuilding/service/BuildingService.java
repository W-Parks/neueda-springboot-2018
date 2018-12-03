package uk.ac.belfastmet.largestbuilding.service;

import java.util.ArrayList;

import uk.ac.belfastmet.largestbuilding.domain.FloorArea;
import uk.ac.belfastmet.largestbuilding.domain.Footprint;
import uk.ac.belfastmet.largestbuilding.domain.Volume;

public class BuildingService {

	public BuildingService() {
		super();
	}
	
	public ArrayList<Volume> getVolume(){
		
		ArrayList<Volume> volumes = new ArrayList<Volume>();
		
		Volume bEF = new Volume();
		bEF.setName("Boeing Everett Factory");
		bEF.setCountry("United States");
		bEF.setPlace("Everett, Washington");
		bEF.setFloorArea("398,000 m2");
		bEF.setVolume("13.3 million m3");
		bEF.setDescription("Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.");
		bEF.setMap("");
		
		Volume gMM = new Volume();
		gMM.setName("Boeing Everett Factory");
		gMM.setCountry("Saudi Arabia");
		gMM.setPlace("Hijaz-Saudi Arabia");
		gMM.setFloorArea("356,000 m2");
		gMM.setVolume("8 million m3");
		gMM.setDescription("The largest mosque in the world, the most sacred place for the Muslims, and surrounds Islam's holiest place, the Kaaba.");
		gMM.setMap("");
		
		Volume jLP = new Volume();
		jLP.setName("Boeing Everett Factory");
		jLP.setCountry("France");
		jLP.setPlace("Toulouse-Blagnac");
		jLP.setFloorArea("122,500 m2");
		jLP.setVolume("122,500 m2");
		jLP.setDescription("The assembly hall of the Airbus A380, the world's largest airliner.");
		jLP.setMap("");
		
		Volume bCW = new Volume();
		bCW.setName("Boeing Composite Wing Center");
		bCW.setCountry("United States");
		bCW.setPlace("Everett, Washington");
		bCW.setFloorArea("111,500 m2");
		bCW.setVolume("3.7 million m3");
		bCW.setDescription("Boeing's assembly site for the production of composite wings for the 777-8 and 777-9");
		bCW.setMap("");
		
		Volume aerium = new Volume();
		aerium.setName("Aerium");
		aerium.setCountry("Germany");
		aerium.setPlace("Halbe, Brandenburg");
		aerium.setFloorArea("70,000 m2");
		aerium.setVolume("5.2 million m3");
		aerium.setDescription("A hangar originally intended to house the construction of a giant airship, this building now houses an indoor theme park, called Tropical Islands Resort.");
		aerium.setMap("");
		
		return volumes;
	}
	
	public ArrayList<Footprint> getFootprint(){
		
		ArrayList<Footprint> footprints = new ArrayList<Footprint>();
		
		Footprint aFAB = new Footprint();
		aFAB.setName("Aalsmeer Flower Auction Building");
		aFAB.setCountry("Netherlands");
		aFAB.setPlace("Aalsmeer");
		aFAB.setFootprint("518,000 m2");
		aFAB.setLxw("740 m x 700 m");
		aFAB.setDescription("The auction building of the flower auction in Aalsmeer.");
		aFAB.setMap("");
		
		Footprint tDM = new Footprint();
		tDM.setName("The Dubai Mall");
		tDM.setCountry("United Arab Emirates");
		tDM.setPlace("Dubai");
		tDM.setFootprint("500,000 m2");
		tDM.setLxw("N/A");
		tDM.setDescription("N/A");
		tDM.setMap("");
		
		Footprint tF = new Footprint();
		tF.setName("Tesla Factory");
		tF.setCountry("United States");
		tF.setPlace("Fremont, California");
		tF.setFootprint("427,354 m2");
		tF.setLxw("N/A");
		tF.setDescription("Automobile production facility of Tesla Motors");
		tF.setMap("");
		
		Footprint bEF = new Footprint();
		bEF.setName("Boeing Everett Factory");
		bEF.setCountry("United States");
		bEF.setPlace("Everett, Washington");
		bEF.setFootprint("398,000 m2");
		bEF.setLxw("900 m x 495 m");
		bEF.setDescription("Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.");
		bEF.setMap("");
		
		Footprint dTTk = new Footprint();
		dTTk.setName("Daikin Texas Technology Park");
		dTTk.setCountry("United States");
		dTTk.setPlace("Waller, Texas");
		dTTk.setFootprint("393,000 m2");
		dTTk.setLxw("N/A");
		dTTk.setDescription("Factory and distribution center for heating and air conditioning products");
		dTTk.setMap("");
		
		return footprints;
	}
	
	public ArrayList<FloorArea> getFloorArea(){
		
		ArrayList<FloorArea> floorareas = new ArrayList<FloorArea>();
		
		FloorArea nCGC = new FloorArea();
		nCGC.setName("New Century Global Center");
		nCGC.setCountry("China");
		nCGC.setPlace("Chengdu");
		nCGC.setFloorArea("	1,760,000 m2");
		nCGC.setMap("");
		
		FloorArea dIA = new FloorArea();
		dIA.setName("Dubai International Airport - Terminal 3");
		dIA.setCountry("United Arab Emirates");
		dIA.setPlace("Dubai");
		dIA.setFloorArea("1,713,000 m2");
		dIA.setMap("");
		
		FloorArea aAE = new FloorArea();
		aAE.setName("Abraj Al-Bait Endowment");
		aAE.setCountry("Saudi Arabia");
		aAE.setPlace("Mecca");
		aAE.setFloorArea("1,575,815 m2");
		aAE.setMap("");
		
		FloorArea cW = new FloorArea();
		cW.setName("CentralWorld");
		cW.setCountry("Thailand");
		cW.setPlace("Bangkok");
		cW.setFloorArea("1,024,000 m2");
		cW.setMap("");
		
		FloorArea aFA = new FloorArea();
		aFA.setName("Aalsmeer Flower Auction");
		aFA.setCountry("Netherlands");
		aFA.setPlace("Aalsmeer");
		aFA.setFloorArea("990,000 m2");
		aFA.setMap("");
		
		return floorareas;
	}
	
	
}
