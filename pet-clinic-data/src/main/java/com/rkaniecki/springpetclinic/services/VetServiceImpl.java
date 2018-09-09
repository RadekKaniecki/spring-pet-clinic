package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Vet;
import com.rkaniecki.springpetclinic.repositories.VetRepository;
import org.springframework.stereotype.Service;

@Service
public class VetServiceImpl implements VetService {

    private final VetRepository vetRepository;

    public VetServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public void save(Vet vet) {
        vetRepository.save(vet);
    }
}
