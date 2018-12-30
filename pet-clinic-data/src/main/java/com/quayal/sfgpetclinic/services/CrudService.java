package com.quayal.sfgpetclinic.services;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CrudService<T, ID> {

	Set<T> findAll();

	T findById(ID id);

	T save(T entity);

	void delete(T entity);

	void deleteById(ID id);
}
