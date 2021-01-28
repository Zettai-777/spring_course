package ru.zettai.spring.aop.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zettai.spring.aop.beans.Book;
import ru.zettai.spring.aop.libraries.SchoolLibrary;
import ru.zettai.spring.aop.libraries.SimpleLibrary;
import ru.zettai.spring.aop.configs.MyConfig;

public class Test1 {
    public static final String SEPARATOR = "============================================";

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book",Book.class);
        SimpleLibrary simpleLibrary = context.getBean("simpleLibraryBean", SimpleLibrary.class);
//        simpleLibrary.getBook();
//        simpleLibrary.getMagazine(21);
        simpleLibrary.addBook("Michail", book);
        simpleLibrary.addMagazine();


//        simpleLibrary.returnBook();
//        System.out.println(SEPARATOR);
//        simpleLibrary.returnBook();
//        System.out.println(SEPARATOR);
//        simpleLibrary.returnMagazine();
//        System.out.println(SEPARATOR);
//        simpleLibrary.addBook();
//        System.out.println(SEPARATOR);
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
//        schoolLibrary.getBook();


        context.close();
    }
}
