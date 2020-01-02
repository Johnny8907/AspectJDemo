package com.example.aspectruntime;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TraceAspect {
    @Pointcut("(execution(* *.*(..)) || execution(!synthetic *.new(..))) && !within(TraceAspect) && !execution(String *.toString())")
    public void methodTrace() {
    }

    @Before("methodTrace()")
    public void beforeMethodTrace(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Log.d("trace", "Before [" + signature.getDeclaringType().getName() + " " + signature.getName() + " " + createParameterMessage(joinPoint) + "]");
    }

    private String createParameterMessage(JoinPoint joinPoint) {
        StringBuffer paramBuffer = new StringBuffer("\n\t[This: ");
        paramBuffer.append(joinPoint.getThis());
        Object[] arguments = joinPoint.getArgs();
        paramBuffer.append("]\n\t[Args: (");
        for (int length = arguments.length, i = 0; i < length; ++i) {
            Object argument = arguments[i];
            paramBuffer.append(argument);
            if (i != length - 1) {
                paramBuffer.append(',');
            }
        }
        paramBuffer.append(")]");
        return paramBuffer.toString();
    }
}
