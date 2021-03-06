package com.quayal.sfgpetclinic.services.springdatajpa;

import com.quayal.sfgpetclinic.model.PetType;
import com.quayal.sfgpetclinic.repositories.PetTypeRepository;
import com.quayal.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeJPAService implements PetTypeService {

	private final PetTypeRepository petTypeRepository;

	public PetTypeJPAService(PetTypeRepository petTypeRepository) {
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType entity) {
		return petTypeRepository.save(entity);
	}

	@Override
	public void delete(PetType entity) {
		petTypeRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);
	}
}
