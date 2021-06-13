package akshat.springframework.petclinic.services;


import akshat.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet save(Vet Vet);
    Vet findById(Long Id);
    Set<Vet> findAll();
}
