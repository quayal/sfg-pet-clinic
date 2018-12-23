package com.quayal.sfgpetclinic.services;

import com.quayal.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
