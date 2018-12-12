package uk.ac.belfastmet.weather.domain;

//import java.util.Map;

import lombok.Data;

@Data
public class TodaysWeather {

	private Location location;
	private Weather weather;
		
	public String toString() {
		
		return location.toString() + weather.toString() + weather.getWind().toString();
	}
}
