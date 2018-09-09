package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Owner;
import com.rkaniecki.springpetclinic.repositories.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public void save(Owner owner) {
        ownerRepository.save(owner);
    }
}
