package uk.ac.belfastmet.character.domain;

public class Character {

	private String name;
	private String series;
	private String image;
	
	public Character() {
		super();
	}

	public Character(String name, String series, String image) {
		super();
		this.name = name;
		this.series = series;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
