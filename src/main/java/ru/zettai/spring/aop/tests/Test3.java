package ru.zettai.spring.aop.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zettai.spring.aop.beans.libraries.SimpleLibrary;
import ru.zettai.spring.aop.configs.MyConfig;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts.");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        SimpleLibrary simpleLibrary = context.getBean(SimpleLibrary.class);
        String bookName = simpleLibrary.returnBook();
        System.out.println("In the library returning the book: " + bookName);

        context.close();
        System.out.println("Method main end.");
    }
}
