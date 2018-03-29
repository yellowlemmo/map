package cui.ssh.repository.impl;

import cui.ssh.Utils;
import cui.ssh.entity.House;
import cui.ssh.repository.HouseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HouseRepositoryImpl extends Utils implements HouseRepository{
    @Override
    public House load(String id) {
        return null;
    }

    @Override
    public House get(String id) {
        return null;
    }

    @Override
    public List<House> findAll(String id) {
        return null;
    }

    @Override
    public void persist(House entity) {

    }

    @Override
    public Long save(House entity) {
        return null;
    }

    @Override
    public void saveOrUpdate(House entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void flush() {

    }
}
