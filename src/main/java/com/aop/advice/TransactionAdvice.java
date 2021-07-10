package com.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Cjl
 * @date 2021/7/8 12:54
// */
//@Component("transaction")
//@Aspect
//
//public class TransactionAdvice {
//    @Pointcut("execution(* com.aop.service..*.*(..))")
//    public void myPoint(){}
//
//    @Before("TransactionAdvice.myPoint()")
//    public Integer begin(){
//        System.out.println("事务开启");
//        return 1;
//    }
//
//    @AfterReturning(value = "TransactionAdvice.myPoint()",returning = "result")
//    public Integer commit(Object result){
//        System.out.println("事务提交，结果为："+result);
//        return 1;
//    }
//
//    @AfterThrowing(value = "TransactionAdvice.myPoint()",throwing = "e")
//    public Integer rollback(Exception e){
//        System.out.println("事务回滚"+e.getMessage());
//        return 1;
//    }
//
//    @After("TransactionAdvice.myPoint()")
//    public Integer release(){
//        System.out.println("资源释放");
//        return 1;
//    }

//    @Around("TransactionAdvice.myPoint()")
//    public Object aroud(ProceedingJoinPoint joinPoint) {
//        Object[] args = joinPoint.getArgs();
//        String name = joinPoint.getSignature().getName();
//        Object result=null;
//        try {
//            System.out.println("事务开始");
//            result = joinPoint.proceed();
//            System.out.println("方法名称："+name+ "，参数为：" + (args!=null ? Arrays.asList(args):null ));
//            System.out.println("事务提交");
//        } catch (Throwable throwable) {
//            System.out.println(throwable.getMessage());
//            throwable.printStackTrace();
//        } finally {
//            System.out.println("资源释放");
//        }
//        return result;
//    }
//}
