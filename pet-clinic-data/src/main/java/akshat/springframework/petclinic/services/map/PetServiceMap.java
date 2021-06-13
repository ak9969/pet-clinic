package akshat.springframework.petclinic.services.map;

import akshat.springframework.petclinic.model.Pet;
import akshat.springframework.petclinic.services.CrudServic;

import java.util.Set;

public class PetServiceMap  extends AbstractMapService<Pet,Long> implements CrudServic<Pet,Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        deleteByID(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
