package com.quayal.sfgpetclinic.services.map;

import com.quayal.sfgpetclinic.model.Speciality;
import com.quayal.sfgpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality entity) {
		return super.save(entity);
	}

	@Override
	public void delete(Speciality entity) {
		super.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
