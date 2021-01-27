package ru.zettai.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* ru.zettai.spring.aop.libraries.SimpleLibrary.*(..))")
    private void allMethodFromSimpleLibrary(){}

    @Pointcut("execution(* ru.zettai.spring.aop.libraries.SimpleLibrary.returnMagazine())")
    private void returnMagazineFromSimpleLibrary(){}

    @Pointcut("allMethodFromSimpleLibrary() && !returnMagazineFromSimpleLibrary()")
    private void allMethodFromSimpleLibraryExceptReturnMagazine(){}

    @Before("allMethodFromSimpleLibraryExceptReturnMagazine()")
    public void beforeGetAllMethodsWithoutReturnMagazineAdvice(){
        System.out.println("beforeGetAllMethodsWithoutReturnMagazineAdvice : write log#4");
    }
//    @Pointcut("execution(* ru.zettai.spring.aop.libraries.SimpleLibrary.get*())")
//    private void allGetMethodsFromSimpleLibrary(){}
//
//    @Before("allGetMethodsFromSimpleLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: write Log #1");
//    }
//
//    @Pointcut("execution(* ru.zettai.spring.aop.libraries.SimpleLibrary.return*())")
//    private void allReturnMethodsFromSimpleLibrary(){}
//
//    @Before("allReturnMethodsFromSimpleLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: write Log #2");
//    }
//
//    @Pointcut("allGetMethodsFromSimpleLibrary() || allReturnMethodsFromSimpleLibrary()")
//    public void allGetAndReturnMethodFromSimpleLibrary(){}
//
//
//    @Before("allGetAndReturnMethodFromSimpleLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: write Log #3");
//    }
//    @Pointcut("execution(* get*(..))")
//    private void allGetWithAllParamsMethod(){}
//
//    @Before("allGetWithAllParamsMethod()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice : logging of try to take a book or a magazine");
//    }
//
//    @Before("allGetWithAllParamsMethod()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice : try to check the access for taken a book or a magazine");
//    }

//    @Before("execution( * returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice : try to return book");
//    }
}
