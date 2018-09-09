package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Vet;
import com.rkaniecki.springpetclinic.repositories.VetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Vet> findAll() {
        List<Vet> vets = new ArrayList<>();
        vetRepository.findAll().iterator().forEachRemaining(vets::add);

        return vets;
    }
}
