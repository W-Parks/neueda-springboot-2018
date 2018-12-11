package uk.ac.belfastmet.titanicconsumer.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Value("${api.passenger.url}")
	private String apiUrl;
	
	private RestTemplate restTemplate;

	public PassengerServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	public ArrayList<Passenger> list(){
		
		String listPassengerUrl = this.apiUrl + "/passenger/";
		
		AllPassengers allPassengers = this.restTemplate.getForObject(listPassengerUrl, AllPassengers.class);
		
		return allPassengers.getAllPassengers();
	}
	
	public Passenger get(Integer passengerId) {
		
		String getPassengerUrl = this.apiUrl + "/passenger/" + passengerId;
		
		Passenger passenger = this.restTemplate.getForObject(getPassengerUrl, Passenger.class);
		
		return passenger;
	}
	
	public Passenger add(Passenger passenger) {
		
		String addPassengerUrl = this.apiUrl + "/passenger/" + passenger.getPassengerId();
		
		this.restTemplate.postForObject(addPassengerUrl, passenger, Passenger.class);
		
		return passenger;
	}
	
	public Passenger update(Passenger passenger) {

		String updatePassengerUrl = this.apiUrl + "/passenger/" + passenger.getPassengerId();
		
		this.restTemplate.put(updatePassengerUrl, passenger, Passenger.class);
		
		return passenger;		
	}
	
	public void delete(Integer passengerId) {
		
		String deletePassengerUrl = this.apiUrl + "/passenger/" + passengerId;
		
		this.restTemplate.delete(deletePassengerUrl);
		
	}
	
}
