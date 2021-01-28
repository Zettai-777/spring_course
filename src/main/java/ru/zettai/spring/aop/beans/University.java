package ru.zettai.spring.aop.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student student1 = new Student("Dmitriy", "Nikanorov", 4, 7.25);
        Student student2 = new Student("Igor", "Korelyakov", 4, 6.45);
        Student student3 = new Student("Raphael", "Druzhinin", 2, 8.15);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Info from method getStudents():\n" + students);
        return students;
    }
}
