package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Owner;

import java.util.List;

public interface OwnerService {

    void save(Owner owner);

    List<Owner> findAll();

}
