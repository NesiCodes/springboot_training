package com.example.h2demo.domain;

import jakarta.persistence.*;


import java.util.Date;

@Entity //tells spring boot that this class is a jpa model
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Column( columnDefinition = "TEXT")
    private String body;

    private Date postedOn;

    //Author
    @ManyToOne
    private Author author;

    protected Post(){

    }


    public Post(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", postedOn=" + postedOn +
                '}';
    }
}
