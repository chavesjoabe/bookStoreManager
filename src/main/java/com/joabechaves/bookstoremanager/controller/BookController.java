package com.joabechaves.bookstoremanager.controller;

import com.joabechaves.bookstoremanager.dto.BookDto;
import com.joabechaves.bookstoremanager.dto.MessageResponseDTO;
import com.joabechaves.bookstoremanager.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {


    private BookService service;

    @Autowired
    public BookController(BookService service){
        this.service = service;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDto book){

        return this.service.create(book);
    }
}
