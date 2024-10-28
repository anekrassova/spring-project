package com.example.springproject;

import com.example.springproject.repository.AuthorRepository; // Импортируйте AuthorRepository
import com.example.springproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    public String getAuthorNameByBookId(int bookId) {
        Book book = bookRepository.findById(bookId);
        if(book != null && book.getAuthor() != null) {
            return book.getAuthor().getAuthorName();
        }
        return null;
    }

    public Book addBook(Book book) {
        if(book.getAuthor() != null){
            Author author = authorRepository.findById(book.getAuthor().getAuthorId()).orElse(null);
            book.setAuthor(author);
        }
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }



}
