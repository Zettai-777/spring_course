package ru.zettai.spring.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ru.zettai.spring.aop.beans.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution (* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice : logging of getting list of students before method getStudents");
//    }
//
//    @AfterReturning(pointcut = "execution (* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student first = students.get(0);
//        first.setName("Mr. " + first.getName());
//        first.setAvgGrade(first.getAvgGrade() - 2);
//
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice : logging of getting list of students after end of method getStudents");
//    }
//
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentLoggingAdvice : logging of throwing exception: " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice : logging normal or abnormal finish of method getStudent()");
    }
}
