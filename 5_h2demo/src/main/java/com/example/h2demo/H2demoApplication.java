package com.example.h2demo;

import com.example.h2demo.domain.Post;
import com.example.h2demo.repository.PostRepository;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2demoApplication {

    private static final Logger logger = LoggerFactory.getLogger(H2demoApplication.class);

    //PostRepository
    @Autowired
    PostRepository postRepository;


    public static void main(String[] args) {
        SpringApplication.run(H2demoApplication.class, args);
    }

    //PostConstruct
    @PostConstruct // lets us run this method after everything has been set up for us
    public void seePosts(){
        logger.info("seePosts method called...");
        for(Post post: postRepository.findAll()){
            logger.info(post.toString());
        }
    }

}
