package com.enterprise.fizzbuzz.soa.ws;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;
import com.enterprise.fizzbuzz.soa.interceptors.TimingInterceptor;
import static com.enterprise.fizzbuzz.soa.proxy.IncrementerProxy.increment;
import static com.enterprise.fizzbuzz.soa.proxy.LassThanOrEqualToProxy.lessThanOrEqualTo;
import static com.enterprise.fizzbuzz.soa.proxy.ModulusConditionProxy.isMod;
import static com.enterprise.fizzbuzz.soa.proxy.PrintLineProxy.printLine;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;

@WebService
@Stateless
@Interceptors(TimingInterceptor.class)
public class FizzBuzz {

    public String fizzBuzz(Integer startingNumber, Integer endNumber) throws SomeObjectIsNullException {
        String message = "";
        for (int i = startingNumber; lessThanOrEqualTo(i, endNumber); i = increment(i, 1)) {
            if (isMod(i, 15)) {
                message = printLine(message, "FizzBuzz");
            } else if (isMod(i, 5)) {
                message = printLine(message, "Buzz");
            } else if (isMod(i, 3)) {
                message = printLine(message, "Fizz");
            } else {
                message = printLine(message, i);                 
            }
        }
        return message;
    }
    
}
