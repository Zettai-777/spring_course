package ru.zettai.spring.aop.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zettai.spring.aop.beans.Book;
import ru.zettai.spring.aop.libraries.SchoolLibrary;
import ru.zettai.spring.aop.libraries.SimpleLibrary;
import ru.zettai.spring.aop.configs.MyConfig;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book",Book.class);

        SimpleLibrary simpleLibrary = context.getBean("simpleLibraryBean", SimpleLibrary.class);
        simpleLibrary.getBook(book);
//        simpleLibrary.returnBook();
        simpleLibrary.getMagazine(23);
//
        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
        schoolLibrary.getBook();


        context.close();
    }
}
