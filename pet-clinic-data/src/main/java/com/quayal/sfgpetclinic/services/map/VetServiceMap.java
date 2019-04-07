package com.quayal.sfgpetclinic.services.map;

import com.quayal.sfgpetclinic.model.Speciality;
import com.quayal.sfgpetclinic.model.Vet;
import com.quayal.sfgpetclinic.services.SpecialityService;
import com.quayal.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	private SpecialityService specialityService;

	public VetServiceMap(SpecialityService specialityService) {
		this.specialityService = specialityService;
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet entity) {

		return super.save(saveSpecialities(entity));
	}

	@Override
	public void delete(Vet entity) {
		super.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	private Vet saveSpecialities(Vet vet) {
		if (!vet.getSpecialities().isEmpty()) {
			vet.getSpecialities().forEach(speciality -> vet.getSpecialities().add(saveSpeciality(speciality)));
		}
		return vet;
	}

	private Speciality saveSpeciality(Speciality speciality) {
		if (speciality.getId() == null) {
			return specialityService.save(speciality);
		} else {
			return speciality;
		}
	}
}
