package com.alanduran.course_spring_framework.bootstrap;

import com.alanduran.course_spring_framework.domain.Author;
import com.alanduran.course_spring_framework.domain.Book;
import com.alanduran.course_spring_framework.repositories.AuthorRepository;
import com.alanduran.course_spring_framework.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author stan = new Author("Stan", "Lee");
        Book comic1 = new Book("Old Man Logan", "123123");
        stan.getBooks().add(comic1);
        comic1.getAuthors().add(stan);

        authorRepository.save(stan);
        bookRepository.save(comic1);

        Author ditko = new Author("Steve", "Ditko");
        Book comic2 = new Book("The Amazing Spiderman", "234234");

        ditko.getBooks().add(comic1);
        comic2.getAuthors().add(ditko);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: ".concat(String.valueOf(bookRepository.count())));
    }
}
