package cui.ssh.repository.impl;

import cui.ssh.Utils;
import cui.ssh.entity.Admin;
import cui.ssh.repository.AdminRepository;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminRepositoryImpl extends Utils implements AdminRepository{
    public Admin login(String username,String password){
        String hql = "from Admin where username=?";
        Query query = this.getCurrentSession().createQuery(hql);
        query.setString(0,username);
        List<Admin> admin = query.list();
        return admin.get(0);
    }

    @Override
    public Admin load(String id) {
        return null;
    }

    @Override
    public Admin get(String id) {
        return null;
    }

    @Override
    public List<Admin> findAll(String id) {
        return null;
    }

    @Override
    public void persist(Admin entity) {

    }

    @Override
    public Long save(Admin entity) {
        return null;
    }

    @Override
    public void saveOrUpdate(Admin entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void flush() {

    }
}
