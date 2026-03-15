package com.AD.loveB.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger Logger = LoggerFactory.getLogger(LoggingAspect.class);


//    advice (what):the line number 27-29
    @Before("execution(* com.AD.loveB.serviceLove.calculateLoveScore(..))")

    public void logMethodCall(JoinPoint jp) {
        Logger.info("Method called "+jp.getSignature().getName());
    }

//    called only if there is some exception
    @AfterThrowing("execution(* com.AD.loveB.serviceLove.calculateLoveScore(..))")

    public void ExceptionLog(JoinPoint jp) {

        Logger.info("Exception in "+jp.getSignature().getName());
    }
}