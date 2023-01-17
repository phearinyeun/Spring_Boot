package Spring.Boot.Spring.repo;

import Spring.Boot.Spring.model.comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentRepository extends JpaRepository<comment, Long> {
}
