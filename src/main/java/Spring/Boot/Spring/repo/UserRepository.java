package Spring.Boot.Spring.repo;

import Spring.Boot.Spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
