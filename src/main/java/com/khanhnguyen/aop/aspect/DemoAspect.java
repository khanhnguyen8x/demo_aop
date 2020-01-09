package com.khanhnguyen.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoAspect {

    //@Pointcut("execution(public void addAccount(..))")
    @Pointcut("execution(* com.khanhnguyen.aop.dao.AccountService.*(..))")
    private void forDaoPackage() {
    }

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("===>>>> Executing @Before advice method");
    }

    @After("forDaoPackage()")
    public void afterAddAccountAdvice() {
        System.out.println("===>>>> Executing @After advice method");
    }
}
