package com.rkaniecki.springpetclinic.bootstrap;

import com.rkaniecki.springpetclinic.model.Owner;
import com.rkaniecki.springpetclinic.model.Pet;
import com.rkaniecki.springpetclinic.model.PetType;
import com.rkaniecki.springpetclinic.model.Speciality;
import com.rkaniecki.springpetclinic.model.Vet;
import com.rkaniecki.springpetclinic.model.Visit;
import com.rkaniecki.springpetclinic.services.OwnerService;
import com.rkaniecki.springpetclinic.services.PetTypeService;
import com.rkaniecki.springpetclinic.services.SpecialityService;
import com.rkaniecki.springpetclinic.services.VetService;
import com.rkaniecki.springpetclinic.services.VisitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if(count == 0) {
            loadData();
        }
    }

    private void loadData() {
        //<--Saving PetTypes-->
        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);

        //<--Saving Specialities-->
        Speciality radiology = new Speciality();
        radiology.setDescription("radiology");
        specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("surgery");
        specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        specialityService.save(dentistry);

        //<--Saving owners + pets + visits-->
        Owner owner = new Owner();
        owner.setFirstName("Michael");
        owner.setLastName("Weston");
        owner.setAddress("123 Baker Street");
        owner.setCity("Miami");
        owner.setTelephone("555999666");

        Pet mikesPet = new Pet();
        mikesPet.setName("Rosco");
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setPetType(dog);
        mikesPet.setOwner(owner);
        owner.getPets().add(mikesPet);

        ownerService.save(owner);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Baker Street");
        owner2.setCity("Miami");
        owner2.setTelephone("111222888");

        Pet fionasPet = new Pet();
        fionasPet.setName("Pixie");
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setPetType(cat);
        fionasPet.setOwner(owner2);
        owner2.getPets().add(fionasPet);

        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");
        catVisit.setPet(fionasPet);

        visitService.save(catVisit);

        //<--Saving Vets-->
        Vet vet = new Vet();
        vet.setFirstName("Sam");
        vet.setLastName("Axe");
        vet.getSpecialities().add(radiology);
        vetService.save(vet);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(surgery);
        vetService.save(vet2);
    }
}
