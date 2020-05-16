package stanic.marija.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import stanic.marija.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
