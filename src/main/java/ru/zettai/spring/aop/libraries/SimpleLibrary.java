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

    public String returnBook(){
        System.out.println("We've returning book in simple library.");
        return "The book successfully returning";
    }
}
