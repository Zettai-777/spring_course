package ru.zettai.spring.spring_introduction.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zettai.spring.spring_introduction.beans.Person;
import ru.zettai.spring.spring_introduction.beans.Pet;
import ru.zettai.spring.spring_introduction.configs.MyConfigWithCompScan;
import ru.zettai.spring.spring_introduction.configs.MyConfigWithoutCompScan;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigWithoutCompScan.class);

//        Pet cat = context.getBean("catBean", Pet.class);
//        Pet dog = context.getBean("dogBean", Pet.class);
//
//        cat.say();
//        dog.say();

        Person person = context.getBean("personBean", Person.class);
//        person.setPet2(dog);
        person.callYourPet();

        System.out.println(person);
    }
}
