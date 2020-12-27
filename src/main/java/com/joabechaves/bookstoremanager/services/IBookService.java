package com.joabechaves.bookstoremanager.services;

import com.joabechaves.bookstoremanager.dto.MessageResponseDTO;
import com.joabechaves.bookstoremanager.entities.Book;

import java.util.List;

public interface IBookService {

    public MessageResponseDTO create(Book book);
    public MessageResponseDTO update(Book book);
    public MessageResponseDTO delete(Long id);
    public List<Book> getAll();
    public Book getById(Long id);
}
