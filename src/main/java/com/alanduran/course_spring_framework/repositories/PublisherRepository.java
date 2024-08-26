package com.alanduran.course_spring_framework.repositories;

import com.alanduran.course_spring_framework.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
