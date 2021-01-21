package ru.zettai.spring.spring_introduction.beans;

public class Dog implements Pet {
    public Dog(){
        System.out.println("Dog bean is created");
    }
    @Override
    public void say(){
        System.out.println("\"Bow-Wow\" said " + this.getClass().getSimpleName());
    }
}
