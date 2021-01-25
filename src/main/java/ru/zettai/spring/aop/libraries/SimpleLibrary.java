package ru.zettai.spring.aop.libraries;

import org.springframework.stereotype.Component;

@Component("simpleLibraryBean")
public class SimpleLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("Book had been take from simple library.");
    }

    public void getMagazine(){
        System.out.println("We've taken magazine from simple library.");
    }

    public String returnBook(){
        System.out.println("We've returning book in simple library.");
        return "The book successfully returning";
    }
}
