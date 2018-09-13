package com.rkaniecki.springpetclinic.model;

import javax.persistence.Entity;
import java.util.Set;

@Entity
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
