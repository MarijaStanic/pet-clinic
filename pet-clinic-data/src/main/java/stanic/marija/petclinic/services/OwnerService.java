package stanic.marija.petclinic.services;

import stanic.marija.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
