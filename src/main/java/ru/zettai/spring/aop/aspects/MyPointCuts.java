package ru.zettai.spring.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* getting*(..))")
    public void allGetWithAllParamsMethod(){}

    @Pointcut("execution(* added*(..))")
    public void allAddWithAllParamsMethods(){}

}
