package com.alanduran.course_spring_framework.repositories;

import com.alanduran.course_spring_framework.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
