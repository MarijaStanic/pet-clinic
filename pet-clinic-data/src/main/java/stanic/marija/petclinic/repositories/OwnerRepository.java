package stanic.marija.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import stanic.marija.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
