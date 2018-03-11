package cui.ssh.repository.impl;

import cui.ssh.Utils;
import cui.ssh.entity.Marker;
import cui.ssh.repository.AddMarkerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AddMarkerRepositoryImpl extends Utils implements AddMarkerRepository{
    @Override
    public Marker load(String id) {
        return null;
    }

    @Override
    public Marker get(String id) {
        return null;
    }

    @Override
    public List<Marker> findAll(String id) {
        return null;
    }

    @Override
    public void persist(Marker entity) {

    }

    @Override
    public Long save(Marker entity) {
        getCurrentSession().save(entity);
        return null;
    }

    @Override
    public void saveOrUpdate(Marker entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void flush() {

    }
}
