package com.example.aspectruntime;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class JointPointTraceAspect {
    private boolean enable = true;
    private String tag = "JointPointTraceAspect";

//    @Pointcut("execution(!synthetic * *(..)) && within(com.example.aspectjdemo.*)")
//    public void tracePoints(){}
//
//    @Before("execution(!synthetic * *(..)) && within(com.example.aspectjdemo.*)")
//    public void beforeTracePoints(JoinPoint joinPoint) {
//        if (enable) {
//            Signature codeSignature = joinPoint.getSignature();
//            Log.d(tag, "Before " + joinPoint.toString());
//        }
//    }

//    @After("tracePoints()")
//    public void afterTracePoints(JoinPoint joinPoint) {
//        if (enable) {
//            Signature codeSignature = joinPoint.getSignature();
//            Log.d(tag, "After " + joinPoint.toString());
//        }
//    }
}
