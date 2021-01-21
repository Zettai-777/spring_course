package ru.zettai.spring.spring_introduction.beans;

public class Cat implements Pet {
    public Cat(){
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("\"Meow-meow\" said " + this.getClass().getSimpleName());
    }
}
