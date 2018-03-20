package cui.ssh.repository.impl;

import cui.ssh.Utils;
import cui.ssh.entity.Marker;
import cui.ssh.repository.MarkerRepository;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.transaction.internal.TransactionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MarkerRepositoryImpl extends Utils implements MarkerRepository
{
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

        String hql = "from Marker where type=?";
        Query query = this.getCurrentSession().createQuery(hql);
        query.setString(0,id);
        List<Marker> list = query.list();
        this.getCurrentSession().close();
        return list;
    }

    @Override
    public void persist(Marker entity) {

    }

    @Override
    public Long save(Marker entity) {
        return (Long) getCurrentSession().save(entity);
    }

    @Override
    public void saveOrUpdate(Marker entity) {

    }

    @Override
    public void delete(String id) {
        String hql = "delete from Marker where position=?";
        Transaction tx = this.getCurrentSession().beginTransaction();
        Query query = this.getCurrentSession().createQuery(hql);
        query.setString(0,id);
        query.executeUpdate();
        tx.commit();
        this.getCurrentSession().close();
    }

    @Override
    public void flush() {

    }
}
