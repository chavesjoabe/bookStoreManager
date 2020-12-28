package com.joabechaves.bookstoremanager.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.javafaker.Faker;
import com.joabechaves.bookstoremanager.dto.BookDto;
import com.joabechaves.bookstoremanager.entities.Book;

import static com.joabechaves.bookstoremanager.utils.AuthorUtils.createFakeAuthor;
import static com.joabechaves.bookstoremanager.utils.AuthorUtils.createFakeAuthorDto;

public class BookUtils {

    private static final Faker faker = Faker.instance();

    public static BookDto createFakeBookDto(){
        return BookDto.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().title())
                .pages(faker.number().numberBetween(0,200))
                .chapters(faker.number().numberBetween(0,50))
                .isbn("0-59-4456-45")
                .publisherName(faker.book().publisher())
                .authorDto(createFakeAuthorDto())
                .build();
    }
    public static Book createFakeBook(){
        return Book.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().title())
                .pages(faker.number().numberBetween(0,200))
                .chapters(faker.number().numberBetween(0,50))
                .isbn("0-59-4456-45")
                .publisherName(faker.book().publisher())
                .author(createFakeAuthor())
                .build();
    }
    public static String asJsonString(BookDto bookDto){
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            objectMapper.registerModules(new JavaTimeModule());

            return objectMapper.writeValueAsString(bookDto);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
