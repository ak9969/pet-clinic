package akshat.springframework.petclinic.services;



import akshat.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet save(Pet pet);
    Pet findById(Long Id);
    Set<Pet> findAll();
}
