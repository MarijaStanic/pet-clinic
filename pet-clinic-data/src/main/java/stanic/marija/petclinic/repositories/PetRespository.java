package stanic.marija.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import stanic.marija.petclinic.model.Pet;

public interface PetRespository extends CrudRepository<Pet, Long> {
}
