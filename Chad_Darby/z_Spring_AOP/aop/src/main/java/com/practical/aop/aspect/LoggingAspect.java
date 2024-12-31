package com.practical.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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


//    @Before("execution(* add*(..))")
//    public void beforeAddAccountAdvice() {
//
//        System.out.println("\n====>>>>>Executing @Before advice on addAccount()");
//    }


//    @Pointcut("execution(* com.practical.aop.dao.*.*(..))")
//    private void forDaoPackage() {}
//
//    @Before("forDaoPackage()")
//    public void beforeAddAccountAdvice() {
//
//        System.out.println("\n=====>>> Executing @Before advice on method");
//
//    }
//    @Before("forDaoPackage()")
//    public void performApiAnalytics() {
//        System.out.println("\n=====>>> Performing API analytics");
//    }


    @Pointcut("execution(* com.practical.aop.dao.*.*(..))")
    private void forDaoPackage() {}

    // create a pointcut for getter methods
    @Pointcut("execution(* com.practical.aop.dao.*.get*(..))")
    private void getter() {}

    // create a pointcut for setter methods
    @Pointcut("execution(* com.practical.aop.dao.*.set*(..))")
    private void setter() {}

    // create pointcut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter() {}

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics() {
        System.out.println("\n=====>>> Performing API analytics");
    }

}
