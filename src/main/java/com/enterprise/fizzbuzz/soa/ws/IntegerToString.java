package com.enterprise.fizzbuzz.soa.ws;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;
import com.enterprise.fizzbuzz.soa.interceptors.TimingInterceptor;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;

@WebService
@Stateless
//@Interceptors(TimingInterceptor.class)
public class IntegerToString {
    
    public String toString(Integer value) throws SomeObjectIsNullException {
        if (value == null) {
            throw new SomeObjectIsNullException();
        }
        return value.toString();
    }
    
}
