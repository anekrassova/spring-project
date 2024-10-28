package com.example.springproject;

import com.example.springproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/{id}")
    public String getAuthorNameByBookId(@PathVariable("id") int bookId){
        return bookService.getAuthorNameByBookId(bookId);
    }
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        bookService.addBook(book);
        return ResponseEntity.ok(book);
    }
    @GetMapping("getAll")
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }
}
