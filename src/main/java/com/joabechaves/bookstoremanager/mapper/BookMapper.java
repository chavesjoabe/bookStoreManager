package com.joabechaves.bookstoremanager.mapper;

import com.joabechaves.bookstoremanager.dto.BookDto;
import com.joabechaves.bookstoremanager.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDto bookDto);
    BookDto toDTO(Book book);
}
