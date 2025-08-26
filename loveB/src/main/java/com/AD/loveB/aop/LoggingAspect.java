package com.AD.loveB.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger Logger = LoggerFactory.getLogger(LoggingAspect.class);
//return type, package name, method name,args
    @Before("execution(* com.AD.loveB.serviceLove.calculateLoveScore(..))")
    public void logMethodCall() {
        Logger.info("Method called");
    }
}