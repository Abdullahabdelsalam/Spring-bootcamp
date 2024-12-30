package com.practical.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

//    @Before("execution(public void addAccount())")
//    public void beforeAddAccountAdvice() {
//
//        System.out.println("\n====>>>>>Executing @Before advice on addAccount()");
//    }


//    @Before("execution(public void com.practical.aop.dao.AccountDAO.addAccount())")
//    public void beforeAddAccountAdvice() {
//
//        System.out.println("\n====>>>>>Executing @Before advice on addAccount()");
//    }

//    @Before("execution(public void add*())")
//    public void beforeAddAccountAdvice() {
//
//        System.out.println("\n====>>>>>Executing @Before advice on addAccount()");
//    }

//    @Before("execution( void add*())")
//    public void beforeAddAccountAdvice() {
//
//        System.out.println("\n====>>>>>Executing @Before advice on addAccount()");
//    }

//    @Before("execution(* add*())")
//    public void beforeAddAccountAdvice() {
//
//        System.out.println("\n====>>>>>Executing @Before advice on addAccount()");
//    }


//    @Before("execution(* add*(com.practical.aop.Account))")
//    public void beforeAddAccountAdvice() {
//
//        System.out.println("\n====>>>>>Executing @Before advice on addAccount()");
//    }

//    @Before("execution(* add*(com.practical.aop.Account,..))")
//    public void beforeAddAccountAdvice() {
//
//        System.out.println("\n====>>>>>Executing @Before advice on addAccount()");
//    }

    @Before("execution(* add*(..))")
    public void beforeAddAccountAdvice() {

        System.out.println("\n====>>>>>Executing @Before advice on addAccount()");
    }



}
