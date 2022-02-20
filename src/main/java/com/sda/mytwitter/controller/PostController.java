package com.sda.mytwitter.controller;

import com.sda.mytwitter.model.Post;
import com.sda.mytwitter.model.PostDto;
import com.sda.mytwitter.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Delegate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    // pobieranie
    @GetMapping()
    public List<Post> getPosts(){
        return postService.getPosts();
    }

    // pobieranie jednego posta po ID
    @GetMapping("/{id}")
    public Post getPost(@PathVariable(name = "id") Long id){
        return postService.getPost(id);
    }

    // wstawianie
    @PutMapping()
    public Post putPost(@RequestBody PostDto postDto){
        return postService.putPost(postDto);
    }

    // usuwanie
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable(name = "id") Long id){

    }

    // edycja
    @PatchMapping("/{id}")
    public Post updatePost(@PathVariable(name = "id") Long id, @RequestBody PostDto postDto){
        return postService.update(id, postDto);
    }
}
