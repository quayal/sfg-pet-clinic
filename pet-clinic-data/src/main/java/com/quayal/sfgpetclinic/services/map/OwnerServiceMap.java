package com.quayal.sfgpetclinic.services.map;

import com.quayal.sfgpetclinic.model.Owner;
import com.quayal.sfgpetclinic.model.Pet;
import com.quayal.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private PetServiceMap petService;
	private PetTypeMapService petTypeService;

	public OwnerServiceMap(PetServiceMap petService, PetTypeMapService petTypeService) {
		this.petService = petService;
		this.petTypeService = petTypeService;
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner entity) {

		if (entity != null) {
			entity.getPets().forEach(pet -> {
				savePetType(pet);
				savePet(pet);
			});

			return super.save(entity);
		} else {
			return null;
		}
	}

	@Override
	public void delete(Owner entity) {
		super.delete(entity);

	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);

	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

	private void savePetType(Pet pet) {

		if (pet.getPetType() != null) {
			if (pet.getPetType().getId() == null) {
				pet.setPetType(petTypeService.save(pet.getPetType()));
			}
		} else {
			throw new RuntimeException("Pet type is required");
		}
	}


	private void savePet(Pet pet) {

		if (pet.getId() == null) {
			Pet savedPet = petService.save(pet);
			pet.setId(savedPet.getId());
		}
	}
}


