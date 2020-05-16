package stanic.marija.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import stanic.marija.petclinic.model.PetType;

public interface PetTypeRespository extends CrudRepository<PetType, Long> {
}
