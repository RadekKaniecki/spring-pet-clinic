package com.rkaniecki.springpetclinic.repositories;

import com.rkaniecki.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {

    Optional<Pet> findByName(String name);
}
