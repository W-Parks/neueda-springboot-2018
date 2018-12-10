package uk.ac.belfastmet.TitanicRestAPI.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.TitanicRestAPI.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

	Passenger findByPassengerId(Integer passengerId);

}
