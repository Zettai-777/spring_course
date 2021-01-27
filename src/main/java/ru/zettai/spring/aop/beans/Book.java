package ru.zettai.spring.aop.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("${book.bookName}")
    private String name;

    public String getName() {
        return name;
    }
}
