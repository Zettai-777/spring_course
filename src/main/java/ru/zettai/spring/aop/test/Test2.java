package ru.zettai.spring.aop.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zettai.spring.aop.beans.Student;
import ru.zettai.spring.aop.beans.University;
import ru.zettai.spring.aop.configs.MyConfig;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        List<Student> studentList = university.getStudents();
        System.out.println(studentList);

        context.close();
    }

}
