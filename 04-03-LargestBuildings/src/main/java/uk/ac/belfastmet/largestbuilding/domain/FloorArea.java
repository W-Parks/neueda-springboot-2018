package uk.ac.belfastmet.largestbuilding.domain;

public class FloorArea extends Building{

	private String floorArea;
	
	public FloorArea() {
		super();
	}

	public FloorArea(String name, String country, String place, String floorArea, String map) {
		super(name, country, place, map);
		this.floorArea = floorArea;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}	

}
