package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.PetType;
import com.rkaniecki.springpetclinic.repositories.PetTypeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<PetType> findAll() {
        List<PetType> petTypes = new ArrayList<>();
        petTypeRepository.findAll().iterator().forEachRemaining(petTypes::add);

        return petTypes;
    }
}
