package com.rkaniecki.springpetclinic.services;

import com.rkaniecki.springpetclinic.model.Owner;
import com.rkaniecki.springpetclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerServiceImplTest {

    private final static String LAST_NAME = "Smith";

    @Mock
    private OwnerRepository ownerRepository;

    @InjectMocks
    private OwnerServiceImpl ownerService;

    private Owner returnOwner;

    @BeforeEach
    void setUp() {
        returnOwner = new Owner();
        returnOwner.setId(1L);
        returnOwner.setLastName(LAST_NAME);
    }

    @Test
    void save() {
        //given
        Owner ownerToSave = new Owner();
        ownerToSave.setId(1L);

        //when
        when(ownerRepository.save(any())).thenReturn(returnOwner);
        Owner savedOwner = ownerService.save(ownerToSave);

        //then
        assertNotNull(savedOwner);
    }

    @Test
    void delete() {
        //given

        //when
        ownerService.delete(returnOwner);

        //then
        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
        //given

        //when
        ownerService.deleteById(1L);

        //then
        verify(ownerRepository).deleteById(anyLong());
    }

    @Test
    void findAll() {
        //given
        Set<Owner> owners = new HashSet<>();

        Owner owner1 = new Owner();
        owner1.setId(1L);

        Owner owner2 = new Owner();
        owner2.setId(2L);

        owners.add(owner1);
        owners.add(owner2);

        //when
        when(ownerRepository.findAll()).thenReturn(owners);
        Set<Owner> returnedOwners = ownerService.findAll();

        //then
        assertNotNull(returnedOwners);
        assertEquals(2, returnedOwners.size());
    }

    @Test
    void findByLastName() {
        //given

        //when
        when(ownerRepository.findByLastName(anyString())).thenReturn(Optional.of(returnOwner));
        Owner owner = ownerService.findByLastName(LAST_NAME);

        //then
        assertNotNull(owner);
        assertEquals("Smith", LAST_NAME);
    }

    @Test
    void findById() {
        //given

        //when
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
        Owner owner = ownerService.findById(1L);

        //then
        assertNotNull(owner);
    }
}