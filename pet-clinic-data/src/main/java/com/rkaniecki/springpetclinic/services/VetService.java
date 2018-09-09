package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Vet;

import java.util.List;

public interface VetService {

    void save(Vet vet);

    List<Vet> findAll();

}
