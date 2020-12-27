package com.joabechaves.bookstoremanager.services;

import com.joabechaves.bookstoremanager.dto.BookDto;
import com.joabechaves.bookstoremanager.dto.MessageResponseDTO;
import com.joabechaves.bookstoremanager.entities.Book;
import com.joabechaves.bookstoremanager.mapper.BookMapper;
import com.joabechaves.bookstoremanager.repositories.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    private IBookRepository repository;
    private final BookMapper bookMapper = BookMapper.INSTANCE;


    @Autowired
    public BookService(IBookRepository repository){
        this.repository = repository;
    }


    public MessageResponseDTO create(BookDto bookDto){
        Book savedBook = bookMapper.toModel(bookDto);

        this.repository.save(savedBook);

        return MessageResponseDTO.builder().
                message("Book saved with ID - " + savedBook.getId()).
                build();
    }

    @Override
    public MessageResponseDTO update(BookDto book) {
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
