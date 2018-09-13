package com.rkaniecki.springpetclinic.repositories;

import com.rkaniecki.springpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {

}
