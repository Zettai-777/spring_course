package ru.zettai.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

 @Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void ru.zettai.spring.aop.libraries.SimpleLibrary.get* ())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice : try to take a book");
    }

    @Before("execution( * returnBook())")
     public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice : try to return book");
    }
}
