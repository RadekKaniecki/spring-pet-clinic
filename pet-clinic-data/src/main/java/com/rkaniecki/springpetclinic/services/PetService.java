package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet save(Pet pet);

    void delete(Pet pet);

    void deleteById(Long id);

    Set<Pet> findAll();

    Pet findByName(String name);

    Pet findById(Long id);
}
