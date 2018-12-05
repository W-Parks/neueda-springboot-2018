package uk.ac.belfastmet.TitanicCrud.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.TitanicCrud.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
	
	Passenger findByPassengerId(Integer passengerId);
	
	Iterable<Passenger> findByName(String name);

	Iterable<Passenger> findBySurvived(Boolean survived);

	Iterable<Passenger> findByPClass(Integer pClass);

	Iterable<Passenger> findBySex(String sex);

	Iterable<Passenger> findByAge(Integer age);

	Iterable<Passenger> findBySibSp(Integer sibSp);

	Iterable<Passenger> findByParch(Integer parch);

	Iterable<Passenger> findByTicket(String ticket);

	Iterable<Passenger> findByFare(Double fare);

	Iterable<Passenger> findByCabin(String cabin);

	Iterable<Passenger> findByEmbarked(String embarked);

	

}
