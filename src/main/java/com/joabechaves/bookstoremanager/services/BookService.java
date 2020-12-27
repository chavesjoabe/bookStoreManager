package com.joabechaves.bookstoremanager.services;

import com.joabechaves.bookstoremanager.dto.MessageResponseDTO;
import com.joabechaves.bookstoremanager.entities.Book;
import com.joabechaves.bookstoremanager.repositories.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService implements IBookService {

    private IBookRepository repository;

    @Autowired
    public BookService(IBookRepository repository){
        this.repository = repository;
    }


    public MessageResponseDTO create(Book book){
        Book savedBook = this.repository.save(book);
        return MessageResponseDTO.builder().
                message("Book saved with ID - " + savedBook.getId()).
                build();
    }

    @Override
    public MessageResponseDTO update(Book book) {
        return null;
    }

    @Override
    public MessageResponseDTO delete(Long id) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public Book getById(Long id) {
        return null;
    }
}
