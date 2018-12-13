package uk.ac.belfastmet.hackernews.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class NewsDetails {

	
	private String by;
	private Integer descendants;
	private Integer id;
	private ArrayList<Integer> kids;
	private Integer score;
	private Integer time;
	private String title;
	private String type;
	
}
