package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Pet;
import com.rkaniecki.springpetclinic.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        petRepository.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findByName(String name) {
        return petRepository.findByName(name).orElse(null);
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }
}
