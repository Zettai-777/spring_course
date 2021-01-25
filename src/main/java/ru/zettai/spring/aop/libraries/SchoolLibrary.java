package ru.zettai.spring.aop.libraries;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("We've take a book from school library.");
    }
}
