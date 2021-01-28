package ru.zettai.spring.aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import ru.zettai.spring.aop.beans.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution (* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice : logging of getting list of students before method getStudents");
    }

    @AfterReturning(pointcut = "execution (* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
        Student first = students.get(0);
        first.setName("Mr. " + first.getName());
        first.setAvgGrade(first.getAvgGrade() - 2);


        System.out.println("afterReturningGetStudentsLoggingAdvice : logging of getting list of students after end of method getStudents");
    }

}
