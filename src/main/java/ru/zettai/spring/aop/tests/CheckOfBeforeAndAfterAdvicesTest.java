package ru.zettai.spring.aop.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zettai.spring.aop.beans.Student;
import ru.zettai.spring.aop.beans.University;
import ru.zettai.spring.aop.configs.MyConfig;

import java.util.List;

public class CheckOfBeforeAndAfterAdvicesTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        List<Student> studentList;
        try {
            studentList = university.getStudents();
            System.out.println(studentList);
        } catch (RuntimeException re) {
            System.err.println("The exception '" + re.toString() + "' have been caught!");
        }
        context.close();
    }

}
