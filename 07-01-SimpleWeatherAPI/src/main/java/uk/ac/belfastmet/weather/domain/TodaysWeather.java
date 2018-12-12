package uk.ac.belfastmet.weather.domain;

import java.util.Map;

import lombok.Data;

@Data
public class TodaysWeather {

	private Location location;
	private Map<String, Object> weather;
	
	public String toString() {
		
		String location = "\n" + this.location.getName() + " , " + this.location.getLatitude() + " , " + this.location.getLongitude() + "\n";
		
		String weather = this.weather.toString();
		return location + weather;
	}
	
}
