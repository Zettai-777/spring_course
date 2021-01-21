package ru.zettai.spring.spring_introduction.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zettai.spring.spring_introduction.beans.Dog;
import ru.zettai.spring.spring_introduction.beans.Person;
import ru.zettai.spring.spring_introduction.beans.Pet;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        System.out.println("Person surname: " + person.getSurname() + "\nPerson age: " + person.getAge());
        person.callYourPet();


        context.close();
    }
}
