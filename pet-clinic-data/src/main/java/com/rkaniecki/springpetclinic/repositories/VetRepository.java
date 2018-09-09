package com.rkaniecki.springpetclinic.repositories;

import com.rkaniecki.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {

}
