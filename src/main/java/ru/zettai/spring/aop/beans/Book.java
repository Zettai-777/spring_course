package ru.zettai.spring.aop.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("${book.bookName}")
    private String name;
    @Value("${book.author}")
    private String author;
    @Value("${book.year}")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String toString(){
        return String.format("Book info: name - %s, author - %s, year of publication - %d"
                ,getName(), getAuthor(),getYearOfPublication());
    }
}
