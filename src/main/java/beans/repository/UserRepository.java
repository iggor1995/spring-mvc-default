package beans.repository;

import beans.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private Long sequence = 0L;
    private Map<Long, User> users = new HashMap<>();

    public void save(User user) {
        sequence++;
        user.setId(sequence);
        users.put(sequence, user);
    }

    public Collection<User> getUsers() {
        return users.values();
    }
}
