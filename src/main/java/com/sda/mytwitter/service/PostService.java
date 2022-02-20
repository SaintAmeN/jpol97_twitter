package com.sda.mytwitter.service;

import com.sda.mytwitter.model.Post;
import com.sda.mytwitter.model.PostDto;
import com.sda.mytwitter.model.PostStatus;
import com.sda.mytwitter.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public Post getPost(Long id) {
        return postRepository.getById(id);
    }

    public Post putPost(PostDto postDto) {
        Post newPost = Post.builder()
                .content(postDto.getContent())
                .status(PostStatus.ORIGINAL)
                .build();

        return postRepository.save(newPost);
    }

    public Post update(Long id, PostDto postDto) {

        return null;
    }
}
