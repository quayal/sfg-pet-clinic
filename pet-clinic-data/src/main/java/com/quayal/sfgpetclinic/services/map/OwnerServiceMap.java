package com.quayal.sfgpetclinic.services.map;

import com.quayal.sfgpetclinic.model.Owner;
import com.quayal.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

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
		return super.save(entity.getId(), entity);
	}

	@Override
	public void delete(Owner entity) {
		super.delete(entity);

	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);

	}
}
