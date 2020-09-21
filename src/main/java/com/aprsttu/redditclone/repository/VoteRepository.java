package com.aprsttu.redditclone.repository;

import com.aprsttu.redditclone.model.Post;
import com.aprsttu.redditclone.model.User;
import com.aprsttu.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
