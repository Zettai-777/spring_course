package ru.zettai.spring.spring_introduction.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
//@Scope("prototype")
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;
    private final Pet pet1;
    private Pet pet2;


//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet1) {
//        System.out.println("Person bean is created and pet1 added");
//        this.pet1 = pet1;
//    }

    public Person(Pet pet1){
        System.out.println("Person bean is created and pet1 added");
        this.pet1 = pet1;
    }

//    @Autowired
//    @Qualifier("dogBean")
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
//        System.out.println(this);
        System.out.println("\"Hello, my lovely pet!\" said " + this.getClass().getSimpleName());
        pet1.say();
        pet2.say();
    }

    @Override
    public String toString() {
        return "Person:\n" +
                "name: " + name +
                ", surname: " + surname +
                ", age: " + age +
                "\npet1: " + pet1.getClass().getSimpleName() +
                ", pet2: " + pet2.getClass().getSimpleName();
    }
}
