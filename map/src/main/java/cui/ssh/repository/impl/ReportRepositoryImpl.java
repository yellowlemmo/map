package cui.ssh.repository.impl;

import cui.ssh.Utils;
import cui.ssh.repository.DomainRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ReportRepositoryImpl extends Utils implements DomainRepository<Record, String> {
    @Override
    public Record load(String id) {
        return null;
    }

    @Override
    public Record get(String id) {
        return null;
    }

    @Override
    public List<Record> findAll(String id) {
        return null;
    }

    @Override
    public void persist(Record entity) {

    }

    @Override
    public Long save(Record entity) {
        return null;
    }

    @Override
    public void saveOrUpdate(Record entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void flush() {

    }
}
