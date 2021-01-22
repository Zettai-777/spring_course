package ru.zettai.spring.spring_introduction.beans;

public class Dog implements Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(){
        System.out.println("Dog bean is created");
    }

    public void init(){
        System.out.println("Init method.\nClass: " + this.getClass().getSimpleName());
    }

    public void destroy(){
        System.out.println("Destroy method.\nClass: " + this.getClass().getSimpleName());
    }

    @Override
    public void say(){
        System.out.println("\"Bow-Wow\" said " + this.getClass().getSimpleName());
    }
}
