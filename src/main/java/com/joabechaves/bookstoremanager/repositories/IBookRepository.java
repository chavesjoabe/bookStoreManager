package com.joabechaves.bookstoremanager.repositories;

import com.joabechaves.bookstoremanager.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {

}
