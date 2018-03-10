package cui.ssh.repository.impl;

import cui.ssh.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepositoryImpl {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return this.sessionFactory.openSession();
    }

    public Person load(long id){
        return (Person)getCurrentSession().get(Person.class,id);
    }
    public Person get(Long id) {
        return (Person)getCurrentSession().get(Person.class,id);
    }

    public List<Person> findAll(Long id) {
        return null;
    }

    public void persist(Person entity) {
        getCurrentSession().persist(entity);
    }

    public Long save(Person entity) {
        return (Long)getCurrentSession().save(entity);
    }

    public void saveOrUpdate(Person entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(Long id) {
        Person person = load(id);
        getCurrentSession().delete(person);
    }

    public void flush() {
        getCurrentSession().flush();
    }
}
