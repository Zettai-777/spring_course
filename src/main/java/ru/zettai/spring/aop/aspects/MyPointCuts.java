package ru.zettai.spring.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* get*(..))")
    public void allGetWithAllParamsMethod(){}

}
