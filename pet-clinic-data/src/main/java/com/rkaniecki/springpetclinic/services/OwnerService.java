package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner save(Owner owner);

    void delete(Owner owner);

    void deleteById(Long id);

    Set<Owner> findAll();

    Owner findByLastName(String lastName);

    Owner findById(Long id);

}
