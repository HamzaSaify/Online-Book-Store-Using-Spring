package com.OnlineBooks.OnlineBook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.OnlineBooks.OnlineBook.entity.BookCategory;


@RepositoryRestResource(collectionResourceRel="bookCateogry", path="book-category")

public interface BookCategoryRepostior extends JpaRepository<BookCategory,Long>{

}
