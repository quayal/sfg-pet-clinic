package com.quayal.sfgpetclinic.services;

import com.quayal.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
