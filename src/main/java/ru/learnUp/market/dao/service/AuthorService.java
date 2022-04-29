package ru.learnUp.market.dao.service;

import org.springframework.stereotype.Repository;
import ru.learnUp.market.dao.entity.Author;
import ru.learnUp.market.dao.repository.AuthorRepository;

import java.util.List;

@Repository
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository author, AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAuthors (){
        return authorRepository.findAll();
    }

    public Author getAuthorId(Long id){
        return authorRepository.getById(id);
    }

}

