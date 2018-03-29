package cui.ssh.repository.impl;

import cui.ssh.Utils;
import cui.ssh.entity.Host;
import cui.ssh.repository.HostRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HostRepositoryImpl extends Utils implements HostRepository{
    @Override
    public Host load(String id) {
        return null;
    }

    @Override
    public Host get(String id) {
        return null;
    }

    @Override
    public List<Host> findAll(String id) {
        return null;
    }

    @Override
    public void persist(Host entity) {

    }

    @Override
    public Long save(Host entity) {
        return null;
    }

    @Override
    public void saveOrUpdate(Host entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void flush() {

    }
}
