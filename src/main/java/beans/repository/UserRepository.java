package beans.repository;

import beans.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class UserRepository {

    @Autowired
    private SessionFactory sessionFactory;


    public void save(User user) {
        sessionFactory.openSession().save(user);
    }

    public Collection<User> getUsers() {
        return sessionFactory.openSession().createCriteria(User.class).list();
    }
}
