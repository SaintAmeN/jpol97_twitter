package com.sda.mytwitter.repository;

import com.sda.mytwitter.model.Post;
import com.sda.mytwitter.model.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
