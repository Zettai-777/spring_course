package ru.zettai.spring.spring_introduction.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private String surname;
    private int age;
    private Pet pet1;
    private Pet pet2;

    @Autowired
    public Person(Pet pet1) {
        System.out.println("Person bean is created and pet1 added");
        this.pet1 = pet1;
    }

    public void setPet2(Pet pet2) {
        System.out.println("In class person added pet2");
        this.pet2 = pet2;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet(){
        System.out.println("\"Hello, my lovely pet!\" said " + this.getClass().getSimpleName());
        pet1.say();
        pet2.say();
    }
}
