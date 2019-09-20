package beans.service;

import beans.entity.User;
import beans.exception.SomethingWrongException;
import beans.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AppService {

    private final UserRepository userRepository;

    public void save(User user) throws SomethingWrongException {
        if (Objects.isNull(user)) {
            throw new IllegalArgumentException("Provided user is null");
        }
        userRepository.save(user);
    }

    public Collection<User> list() {
        return userRepository.getUsers();
    }
}
