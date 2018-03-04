package cui.ssh.Service.impl;

import cui.ssh.Service.PersonService;
import cui.ssh.entity.Person;
import cui.ssh.repository.PersonRepository;
import cui.ssh.repository.impl.PersonRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepositoryImpl personRepository;

    @Override
    public Long savePerson() {
        Person person = new Person();
        person.setUsername("x");
        person.setPhone("10086");
        person.setAddress("ne");
        person.setRemark("this is **");
        return personRepository.save(person);
    }
}
