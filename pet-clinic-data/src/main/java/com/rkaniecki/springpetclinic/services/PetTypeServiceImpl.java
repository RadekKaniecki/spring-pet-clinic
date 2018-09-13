package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.PetType;
import com.rkaniecki.springpetclinic.repositories.PetTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceImpl implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeServiceImpl(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public void save(PetType petType) {
        petTypeRepository.save(petType);
    }
}
