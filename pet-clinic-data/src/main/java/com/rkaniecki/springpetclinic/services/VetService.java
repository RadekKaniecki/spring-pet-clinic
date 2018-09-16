package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet save(Vet vet);

    void delete(Vet vet);

    void deleteById(Long id);

    Set<Vet> findAll();

    Vet findByLastName(String lastName);

    Vet findById(Long id);
}
