package com.alanduran.course_spring_framework.repositories;

import com.alanduran.course_spring_framework.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
