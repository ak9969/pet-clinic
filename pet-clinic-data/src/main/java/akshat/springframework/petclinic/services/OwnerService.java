package akshat.springframework.petclinic.services;


import akshat.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudServic<Owner,Long> {
    Owner findByLastName(String lastName);

}
