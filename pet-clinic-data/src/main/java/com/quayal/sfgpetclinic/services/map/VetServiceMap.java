package com.quayal.sfgpetclinic.services.map;

import com.quayal.sfgpetclinic.model.Vet;
import com.quayal.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

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
		return super.save(entity);
	}

	@Override
	public void delete(Vet entity) {
		super.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
