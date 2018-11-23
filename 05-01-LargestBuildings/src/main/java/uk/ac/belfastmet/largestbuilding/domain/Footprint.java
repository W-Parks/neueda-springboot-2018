package uk.ac.belfastmet.largestbuilding.domain;

public class Footprint extends Building {
	
	private String footprint;
	private String lxw;
	private String description;
	
	public Footprint() {
		super();
	}
	
	public Footprint(String name, String country, String place, String footprint, String lxw, String description, String map) {
		super(name, country, place, map);
		this.footprint = footprint;
		this.lxw = lxw;
		this.description = description;
	}

	public String getFootprint() {
		return footprint;
	}

	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}

	public String getLxw() {
		return lxw;
	}

	public void setLxw(String lxw) {
		this.lxw = lxw;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
