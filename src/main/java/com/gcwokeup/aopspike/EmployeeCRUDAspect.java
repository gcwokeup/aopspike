package com.gcwokeup.aopspike;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeCRUDAspect {

  @Before("execution(* com.gcwokeup.aopspike.*.*(..))")
  public void logBeforeV1(JoinPoint joinPoint) {
    System.out.println("EmployeeCRUDAspect.logBeforeV1() : " + joinPoint.getSignature().getName());
  }

  @Before("execution(* com.gcwokeup.aopspike.*.*(..))")
  public void logBeforeV2(JoinPoint joinPoint) {
    System.out.println("EmployeeCRUDAspect.logBeforeV2() : " + joinPoint.getSignature().getName());
  }

  @After("execution(* com.gcwokeup.aopspike.*.*(..))")
  public void logAfterV1(JoinPoint joinPoint) {
    System.out.println("EmployeeCRUDAspect.logAfterV1() : " + joinPoint.getSignature().getName());
    System.out.println("gino");
  }

  @After("execution(* com.gcwokeup.aopspike.*.*(..))")
  public void logAfterV2(JoinPoint joinPoint) {
    System.out.println("EmployeeCRUDAspect.logAfterV2() : " + joinPoint.getSignature().getName());
  }
}
