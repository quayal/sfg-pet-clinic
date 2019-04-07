package com.quayal.sfgpetclinic.services.springdatajpa;

import com.quayal.sfgpetclinic.model.Owner;
import com.quayal.sfgpetclinic.repositories.OwnerRepository;
import com.quayal.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
@Profile("springdatajpa")
public class OwnerJPAService implements OwnerService {

	private final OwnerRepository ownerRepository;

	public OwnerJPAService(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);

		return owners;
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner entity) {
		return ownerRepository.save(entity);
	}

	@Override
	public void delete(Owner entity) {
		ownerRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);

	}
}
