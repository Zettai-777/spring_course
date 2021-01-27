package ru.zettai.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*(..))")
    private void allGetWithAllParamsMethod(){}

    @Before("allGetWithAllParamsMethod()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice : try to take a book or a magazine");
    }

    @Before("allGetWithAllParamsMethod()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice : try to check the access for taken a book or a magazine");
    }

//    @Before("execution( * returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice : try to return book");
//    }
}
