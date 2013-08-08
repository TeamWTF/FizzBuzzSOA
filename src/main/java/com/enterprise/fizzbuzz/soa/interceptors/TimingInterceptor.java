package com.enterprise.fizzbuzz.soa.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class TimingInterceptor {
    @AroundInvoke
    protected Object logTiming(InvocationContext ctx) throws Exception {
        Long startTime = System.currentTimeMillis();
        try {
            return ctx.proceed();
        } finally {
            System.out.println("Invoaction of "+ctx.getTarget().getClass()+"."+ctx.getMethod()+" took ["+(System.currentTimeMillis()-startTime)+"]ms");
        }
    }    
}
