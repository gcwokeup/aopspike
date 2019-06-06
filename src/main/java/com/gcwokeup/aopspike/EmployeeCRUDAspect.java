package com.gcwokeup.aopspike;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeCRUDAspect {

  @Before("@annotation(com.gcwokeup.aopspike.CustomAnnotation)")
  public void logBeforeV1(JoinPoint joinPoint) {
    System.out.println("EmployeeCRUDAspect.logBeforeV1() : " + joinPoint.getSignature().getName());
  }

  @Before("@annotation(CustomAnnotation)")
  public void logBeforeV2(JoinPoint joinPoint) {
    System.out.println("EmployeeCRUDAspect.logBeforeV2() : " + joinPoint.getSignature().getName());
  }

  @After("@annotation(CustomAnnotation)")
  public void logAfterV1(JoinPoint joinPoint) {
    System.out.println("EmployeeCRUDAspect.logAfterV1() : " + joinPoint.getSignature().getName());
    System.out.println("gino");
  }

  @After("@annotation(CustomAnnotation)")
  public void logAfterV2(JoinPoint joinPoint) {
    System.out.println("EmployeeCRUDAspect.logAfterV2() : " + joinPoint.getSignature().getName());
  }
}
