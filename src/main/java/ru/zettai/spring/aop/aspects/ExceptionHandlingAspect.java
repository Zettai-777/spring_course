package ru.zettai.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.zettai.spring.aop.libraries.SimpleLibrary;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("ru.zettai.spring.aop.aspects.MyPointCuts.allGetWithAllParamsMethod()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice : catch/handling exception " +
                "for try to take a book/magazine.");
        System.out.println(SimpleLibrary.SEPARATOR);
    }

    @Before("ru.zettai.spring.aop.aspects.MyPointCuts.allAddWithAllParamsMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice : catch/handling exception " +
                "for try to take a book/magazine.");
        System.out.println(SimpleLibrary.SEPARATOR);
    }
}
