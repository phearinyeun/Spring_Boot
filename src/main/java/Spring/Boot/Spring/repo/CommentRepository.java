package Spring.Boot.Spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.events.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
