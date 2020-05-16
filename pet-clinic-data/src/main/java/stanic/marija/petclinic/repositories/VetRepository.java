package stanic.marija.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import stanic.marija.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
