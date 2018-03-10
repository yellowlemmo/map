package cui.ssh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Utils {
    @Autowired
    private SessionFactory sessionFactory;
    public Session getCurrentSession(){
        return this.sessionFactory.openSession();
    }
}
