package ru.zettai.spring.spring_introduction.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zettai.spring.spring_introduction.beans.Cat;
import ru.zettai.spring.spring_introduction.beans.Person;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
//        Cat myCat = context.getBean(Cat.class);
//        myCat.say();

        context.close();
    }
}
