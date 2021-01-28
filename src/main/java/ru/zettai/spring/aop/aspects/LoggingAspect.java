package ru.zettai.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.zettai.spring.aop.beans.Book;
import ru.zettai.spring.aop.libraries.SimpleLibrary;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* ru.zettai.spring.aop.libraries.SimpleLibrary.*(..))")
//    private void allMethodFromSimpleLibrary(){}
//
//    @Pointcut("execution(* ru.zettai.spring.aop.libraries.SimpleLibrary.returnMagazine())")
//    private void returnMagazineFromSimpleLibrary(){}
//
//    @Pointcut("allMethodFromSimpleLibrary() && !returnMagazineFromSimpleLibrary()")
//    private void allMethodFromSimpleLibraryExceptReturnMagazine(){}
//
//    @Before("allMethodFromSimpleLibraryExceptReturnMagazine()")
//    public void beforeGetAllMethodsWithoutReturnMagazineAdvice(){
//        System.out.println("beforeGetAllMethodsWithoutReturnMagazineAdvice : write log#4");
//    }
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

    @Before("ru.zettai.spring.aop.aspects.MyPointCuts.allGetWithAllParamsMethod()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice : logging of try to take a book or a magazine");
        System.out.println(SimpleLibrary.SEPARATOR);
    }

    @Before("ru.zettai.spring.aop.aspects.MyPointCuts.allAddWithAllParamsMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        System.out.println("Method signature:" + signature);
        System.out.println("Method:" + signature.getMethod());
        System.out.println("Return type:" + signature.getReturnType());
        System.out.println("Method name:" + signature.getName());

        if(signature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();
            for(Object arg : args){
                if(arg instanceof Book){
                    Book book = (Book) arg;
                    System.out.println(book);
                }else if(arg instanceof String){
                    System.out.println("The book added by user: " + arg);
                }
            }
        }

        System.out.println("beforeAddBookAdvice : logging of try to take a book or a magazine");
        System.out.println(SimpleLibrary.SEPARATOR);
    }


//    @Before("execution( * returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice : try to return book");
//    }
}
