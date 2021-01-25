package ru.zettai.spring.aop.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zettai.spring.aop.libraries.SchoolLibrary;
import ru.zettai.spring.aop.libraries.SimpleLibrary;
import ru.zettai.spring.aop.configs.MyConfig;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        SimpleLibrary simpleLibrary = context.getBean("simpleLibraryBean", SimpleLibrary.class);
//        simpleLibrary.getBook();
        simpleLibrary.returnBook();
//        simpleLibrary.getMagazine();
//
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
