package uk.ac.belfastmet.TitanicCrud.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.TitanicCrud.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
	
	Passenger findByPassengerId(Integer passengerId);
	
	Iterable<Passenger> findByNameContaining(String name);
	
	Iterable<Passenger> findBySurvived(Boolean survived);

	Iterable<Passenger> findBySex(String sex);

	Iterable<Passenger> findByEmbarked(String embarked);

	

	

}
