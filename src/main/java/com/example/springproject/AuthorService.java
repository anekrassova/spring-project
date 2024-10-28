package com.example.springproject;

import com.example.springproject.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }
}
