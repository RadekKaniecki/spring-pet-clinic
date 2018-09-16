package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Speciality;

import java.util.Set;

public interface SpecialityService {

    Speciality save(Speciality speciality);

    void delete(Speciality speciality);

    void deleteById(Long id);

    Set<Speciality> findAll();

    Speciality findById(Long id);
}
