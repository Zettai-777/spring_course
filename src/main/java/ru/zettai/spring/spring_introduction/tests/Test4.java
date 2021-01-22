package ru.zettai.spring.spring_introduction.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zettai.spring.spring_introduction.beans.Dog;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog = context.getBean("myPet1", Dog.class);
        dog.setName("Benni");
        Dog anotherDog = context.getBean("myPet1", Dog.class);
        anotherDog.setName("Arthur");

        System.out.println(dog.getName());
        System.out.println(anotherDog.getName());


        System.out.println(dog == anotherDog);
        context.close();
    }
}
