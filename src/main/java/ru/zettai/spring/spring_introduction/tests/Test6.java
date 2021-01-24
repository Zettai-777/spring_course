package ru.zettai.spring.spring_introduction.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zettai.spring.spring_introduction.beans.Person;
import ru.zettai.spring.spring_introduction.configs.MyConfig;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
    }
}
