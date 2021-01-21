package ru.zettai.spring.spring_introduction.tests;

import ru.zettai.spring.spring_introduction.beans.Cat;
import ru.zettai.spring.spring_introduction.beans.Dog;
import ru.zettai.spring.spring_introduction.beans.Pet;

public class Test1 {

    public static void main(String[] args) {
        Pet pet = new Dog();
        Pet pet1 = new Cat();
        pet.say();
    }
}
