package ru.zettai.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice : в библиотеку пытаются вернуть книгу.");
        Object targetMethodResult;
//        long start = System.currentTimeMillis();
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (RuntimeException re) {
            System.out.printf("aroundReturnBookLoggingAdvice : exception '%s' caught%n", re);
//            targetMethodResult = "Unknown book name";
            throw re;
        }

        targetMethodResult = targetMethodResult + " (Do not remember author name)";
//        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice : в библиотеку возвращают книгу.");
//        System.out.println("Around method works about :" + (end-start) + " ms");

        return targetMethodResult;
    }

}
