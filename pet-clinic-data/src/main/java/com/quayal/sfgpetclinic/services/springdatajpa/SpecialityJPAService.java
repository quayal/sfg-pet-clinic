package com.quayal.sfgpetclinic.services.springdatajpa;

import com.quayal.sfgpetclinic.model.Speciality;
import com.quayal.sfgpetclinic.repositories.SpecialityRepository;
import com.quayal.sfgpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialityJPAService implements SpecialityService {

	private SpecialityRepository specialityRepository;

	public SpecialityJPAService(SpecialityRepository specialityRepository) {
		this.specialityRepository = specialityRepository;
	}


	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<>();
		specialityRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		return specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality entity) {
		return specialityRepository.save(entity);
	}

	@Override
	public void delete(Speciality entity) {
		specialityRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		specialityRepository.deleteById(id);
	}
}
