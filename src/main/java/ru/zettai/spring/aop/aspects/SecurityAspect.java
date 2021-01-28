package ru.zettai.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("ru.zettai.spring.aop.aspects.MyPointCuts.allGetWithAllParamsMethod()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice : try to check the access for taken a book or a magazine");
    }

}
