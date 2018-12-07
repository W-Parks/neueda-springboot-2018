package uk.ac.belfastmet.BreakfastCereals.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.BreakfastCereals.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer>{

	Cereal findByCerealId(Integer cerealId);

	Iterable<Cereal> findBymanufacturer(String manufacturer);

	Iterable<Cereal> findByCerealContaining(String cereal);
	
}
