package cui.ssh.repository.impl;

import cui.ssh.Utils;
import cui.ssh.repository.DomainRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HostRepositoryImpl extends Utils implements DomainRepository<Host, String> {
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
