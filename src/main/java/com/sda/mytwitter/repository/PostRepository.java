package com.sda.mytwitter.repository;

import com.sda.mytwitter.model.ApplicationUser;
import com.sda.mytwitter.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
