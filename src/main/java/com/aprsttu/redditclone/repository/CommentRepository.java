package com.aprsttu.redditclone.repository;

import com.aprsttu.redditclone.model.Comment;
import com.aprsttu.redditclone.model.Post;
import com.aprsttu.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
