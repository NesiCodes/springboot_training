package com.example.h2demo.service;

import com.example.h2demo.domain.Author;
import com.example.h2demo.domain.Post;
import com.example.h2demo.repository.AuthorRepository;
import com.example.h2demo.repository.PostRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DataLoader {
    private PostRepository postRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    private void loadData(){
        Author author = new Author("Unejsi", "Isufaj");
        authorRepository.save(author);

        Post post = new Post("Spring Data Rocks!!!");
        post.setBody("Body of the post here...");
        post.setPostedOn(new Date());
        post.setAuthor(author);
        postRepository.save(post);
    }
}
