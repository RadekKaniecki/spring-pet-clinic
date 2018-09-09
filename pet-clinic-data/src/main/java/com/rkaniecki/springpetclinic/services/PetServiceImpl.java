package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.repositories.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
}
