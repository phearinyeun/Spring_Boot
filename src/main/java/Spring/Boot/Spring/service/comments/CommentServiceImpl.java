package Spring.Boot.Spring.service.comments;

import Spring.Boot.Spring.repo.CommentRepository;

public class CommentServiceImpl implements CommentService{
    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
}
