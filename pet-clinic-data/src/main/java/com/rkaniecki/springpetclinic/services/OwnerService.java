package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
