package com.AD.loveB.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {
    private static final Logger Logger = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution(* com.AD.loveB.serviceLove.calculateLoveScore(..))")
    public Object MonitorTime(ProceedingJoinPoint jp) throws Throwable {
    long start=System.currentTimeMillis();
   Object obj= jp.proceed();

    long end=System.currentTimeMillis();
    Logger.info("Time taken :"+(end-start)+" milli seconds");
    return obj;
    }
}
