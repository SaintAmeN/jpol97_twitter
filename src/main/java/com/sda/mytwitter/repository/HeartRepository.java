package com.sda.mytwitter.repository;

import com.sda.mytwitter.model.Heart;
import com.sda.mytwitter.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface HeartRepository extends JpaRepository<Heart, Long> {
}
