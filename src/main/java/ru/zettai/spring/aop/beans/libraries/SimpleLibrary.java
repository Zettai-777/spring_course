package ru.zettai.spring.aop.beans.libraries;

import org.springframework.stereotype.Component;
import ru.zettai.spring.aop.beans.Book;

@Component("simpleLibraryBean")
public class SimpleLibrary extends AbstractLibrary{
    public static final String SEPARATOR = "=====================================================";

    public void getBook(Book book) {
        System.out.println("Book \"" + book.getName() + "\" had been taken from simple library.");
        System.out.println(SEPARATOR);
    }

    @Override
    public void getBook(){
        System.out.println("We've taken book from simple library");
        System.out.println(SEPARATOR);

    }

    public void getMagazine(int price){
        System.out.println("We've taken magazine from simple library. Its cost:"  + price);
        System.out.println(SEPARATOR);
    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("We've returning book in simple library.");
        return "Adventure of Hecelberry Finn";
    }

    public void returnMagazine(){
        System.out.println("We've returning magazine in simple library.");
        System.out.println(SEPARATOR);
    }

    public void addBook(String personName, Book book){
        System.out.println("We've added the new book in simple library.");
        System.out.println(SEPARATOR);
    }

    public void addMagazine(){
        System.out.println("We've added the new magazine in simple library.");
        System.out.println(SEPARATOR);
    }
}
