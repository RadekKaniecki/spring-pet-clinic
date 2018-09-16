package com.rkaniecki.springpetclinic.repositories;

import com.rkaniecki.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {

    Optional<PetType> findByName(String name);
}
