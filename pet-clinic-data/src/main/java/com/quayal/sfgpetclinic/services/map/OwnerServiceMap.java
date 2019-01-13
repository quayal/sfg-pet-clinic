package com.quayal.sfgpetclinic.services.map;

import com.quayal.sfgpetclinic.model.Owner;
import com.quayal.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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
		return super.save(entity);
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
}
