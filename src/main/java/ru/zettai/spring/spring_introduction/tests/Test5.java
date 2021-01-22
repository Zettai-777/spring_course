package ru.zettai.spring.spring_introduction.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zettai.spring.spring_introduction.beans.Dog;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet1", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet1", Dog.class);
        yourDog.say();

        context.close();
    }
}
