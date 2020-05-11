package stanic.marija.petclinic.services;

import stanic.marija.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
    Vet findByLastName(String lastName);
}
