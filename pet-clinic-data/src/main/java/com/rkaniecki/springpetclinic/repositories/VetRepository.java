package com.rkaniecki.springpetclinic.repositories;

import com.rkaniecki.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {

    Optional<Vet> findByLastName(String lastName);

}
