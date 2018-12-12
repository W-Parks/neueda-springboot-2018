package uk.ac.belfastmet.weather.domain;

import java.util.Map;

import lombok.Data;

@Data
public class Weather {

	private String description;
	private String precipitation;
	private Integer temperature;
	private String humidity;
	private Integer pressure;
	private Integer cloudcover;
	private Map<String, Object> wind;	//fudging for now
	private String image;
	
}
