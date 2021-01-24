package ru.zettai.spring.spring_introduction.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zettai.spring.spring_introduction.beans.Dog;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog dog1 = context.getBean(Dog.class);
        Dog dog2 = context.getBean(Dog.class);
        assert dog1==dog2;
        System.out.println(dog1);
        System.out.println(dog2);
        context.close();
    }
}
