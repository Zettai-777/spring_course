package ru.zettai.spring.aop.libraries;

import org.springframework.stereotype.Component;
import ru.zettai.spring.aop.beans.Book;

@Component("simpleLibraryBean")
public class SimpleLibrary extends AbstractLibrary{

    public void getBook(Book book) {
        System.out.println("Book \"" + book.getName() + "\" had been taken from simple library.");
    }

    @Override
    public void getBook(){
        System.out.println("We've taken book from simple library");
    }

    public void getMagazine(int price){
        System.out.println("We've taken magazine from simple library. Its cost:"  + price);
    }

    public void returnBook(){
        System.out.println("We've returning book in simple library.");
    }

    public void returnMagazine(){
        System.out.println("We've returning magazine in simple library.");
    }

    public void addBook(){
        System.out.println("We've added the new book in simple library.");
    }

    public void addMagazine(){
        System.out.println("We've added the new magazine in simple library.");
    }
}
