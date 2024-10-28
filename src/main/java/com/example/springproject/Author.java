package com.example.springproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;
    private int authorAge;
    public Author() {}
    public Author(int authorId, String authorName, int authorAge) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorAge = authorAge;
    }
    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getAuthorAge() {
        return authorAge;
    }
    public void setAuthorAge(int authorAge) {
        this.authorAge = authorAge;
    }
}
