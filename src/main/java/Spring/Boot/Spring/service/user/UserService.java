package Spring.Boot.Spring.service.user;

import Spring.Boot.Spring.model.User;

import java.util.List;

public interface UserService {
    List<User> findByIsPublished(boolean isPublished);
    List<User> findByTitleContaining(String title);
}
