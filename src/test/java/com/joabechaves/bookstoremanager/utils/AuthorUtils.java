package com.joabechaves.bookstoremanager.utils;

import com.github.javafaker.Faker;
import com.joabechaves.bookstoremanager.dto.AuthorDto;
import com.joabechaves.bookstoremanager.dto.BookDto;
import com.joabechaves.bookstoremanager.entities.Author;
import com.joabechaves.bookstoremanager.entities.Book;

public class AuthorUtils {

    private static final Faker faker = Faker.instance();

    public static AuthorDto createFakeAuthorDto(){
        return AuthorDto.builder()
                .id(faker.number().randomNumber())
                .name(faker.name().fullName())
                .age(faker.number().numberBetween(0,85))
                .build();
    }
    public static Author createFakeAuthor(){
        return Author.builder()
                .id(faker.number().randomNumber())
                .name(faker.name().fullName())
                .age(faker.number().numberBetween(0,85))
                .build();
    }
}
