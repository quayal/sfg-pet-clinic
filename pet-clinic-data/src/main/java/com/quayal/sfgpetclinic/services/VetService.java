package com.quayal.sfgpetclinic.services;

import com.quayal.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
