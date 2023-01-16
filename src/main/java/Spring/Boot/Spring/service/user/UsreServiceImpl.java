package Spring.Boot.Spring.service.user;

import Spring.Boot.Spring.model.User;
import Spring.Boot.Spring.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsreServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UsreServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> findByIsPublished(boolean isPublished) {
        return null;
    }

    @Override
    public List<User> findByTitleContaining(String title) {
        return null;
    }
}
