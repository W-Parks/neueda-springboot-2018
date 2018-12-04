package uk.ac.belfastmet.TitanicCrud.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.TitanicCrud.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

}
