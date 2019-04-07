package com.quayal.sfgpetclinic.services.map;

import com.quayal.sfgpetclinic.model.Pet;
import com.quayal.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet entity) {
		return super.save(entity);
	}

	@Override
	public void delete(Pet entity) {
		super.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
