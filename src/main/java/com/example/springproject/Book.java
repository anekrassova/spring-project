package com.example.springproject;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "authorId", referencedColumnName = "authorId")
    private Author author;

    public Book() {}

    public Book(int bookId, String name, Author author) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
