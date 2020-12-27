package com.joabechaves.bookstoremanager.services;

import com.joabechaves.bookstoremanager.dto.BookDto;
import com.joabechaves.bookstoremanager.dto.MessageResponseDTO;
import com.joabechaves.bookstoremanager.entities.Book;

import java.util.List;

public interface IBookService {

    public MessageResponseDTO create(BookDto book);
    public MessageResponseDTO update(BookDto book);
    public MessageResponseDTO delete(Long id);
    public List<Book> getAll();
    public Book getById(Long id);
}
