package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Speciality;
import com.rkaniecki.springpetclinic.repositories.SpecialityRepository;
import org.springframework.stereotype.Service;

@Service
public class SpecialityServiceImpl implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialityServiceImpl(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public void save(Speciality speciality) {
        specialityRepository.save(speciality);
    }
}
