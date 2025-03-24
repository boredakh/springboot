package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    // GET /posts
    @GetMapping
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    // GET /posts/{id}
    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postRepository.findById(id).orElse(null);
    }

    // POST /posts
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    // PUT /posts/{id}
    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post post) {
        post.setId(id);
        return postRepository.save(post);
    }

    // DELETE /posts/{id}
    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable Long id) {
        postRepository.deleteById(id);
        return "Post deleted successfully";
    }

    // GET /posts/icRating/{icRating}
    @GetMapping("/icRating/{icRating}")
    public List<Post> getPostsByIcRating(@PathVariable Boolean icRating) {
        return postRepository.findByIcRating(icRating);
    }
}