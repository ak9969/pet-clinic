package akshat.springframework.petclinic.services;


import akshat.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner save(Owner owner);
    Owner findById(Long Id);
    Set<Owner> findAll();

}
