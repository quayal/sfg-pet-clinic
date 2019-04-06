package com.quayal.sfgpetclinic.repositories;

import com.quayal.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
