package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.PetType;

import java.util.List;

public interface PetTypeService {

    void save(PetType petType);

    List<PetType> findAll();
}
