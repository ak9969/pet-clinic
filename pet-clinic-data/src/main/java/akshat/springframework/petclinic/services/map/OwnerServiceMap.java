package akshat.springframework.petclinic.services.map;

import akshat.springframework.petclinic.model.Owner;
import akshat.springframework.petclinic.services.CrudServic;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudServic<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        deleteByID(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
