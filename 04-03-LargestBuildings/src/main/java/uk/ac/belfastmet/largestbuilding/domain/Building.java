package uk.ac.belfastmet.largestbuilding.domain;

public class Building {

	private String name;
	private String country;
	private String place;
	private String map;
	
	public Building() {
		super();
	}
	
	public Building(String name, String country, String place, String map) {
		super();
		this.name = name;
		this.country = country;
		this.place = place;
		this.map = map;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}
	
	
	
}
