package akshat.springframework.petclinic.services.map;

import akshat.springframework.petclinic.model.Vet;
import akshat.springframework.petclinic.services.CrudServic;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudServic<Vet,Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        deleteByID(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}

