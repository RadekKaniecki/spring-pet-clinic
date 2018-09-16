package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.PetType;

import java.util.Set;

public interface PetTypeService {

    PetType save(PetType petType);

    void delete(PetType petType);

    void deleteById(Long id);

    Set<PetType> findAll();

    PetType findByName(String name);

    PetType findById(Long id);
}
