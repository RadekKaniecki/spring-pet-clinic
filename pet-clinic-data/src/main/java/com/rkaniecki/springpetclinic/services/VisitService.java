package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Visit;

import java.util.Set;

public interface VisitService {

    Visit save(Visit visit);

    void delete(Visit visit);

    void deleteById(Long id);

    Set<Visit> findAll();

    Visit findById(Long id);
}
