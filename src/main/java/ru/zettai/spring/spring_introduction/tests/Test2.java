package ru.zettai.spring.spring_introduction.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zettai.spring.spring_introduction.beans.Pet;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet dog = context.getBean("myPet",Pet.class);
        dog.say();
        context.close();
    }
}
