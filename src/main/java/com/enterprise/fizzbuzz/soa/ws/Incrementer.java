package com.enterprise.fizzbuzz.soa.ws;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;
import com.enterprise.fizzbuzz.soa.interceptors.TimingInterceptor;
import java.math.BigInteger;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;

@WebService
@Stateless
//@Interceptors(TimingInterceptor.class)
public class Incrementer {

    public Integer incrementBy(Integer startingNumber, Integer incrementAmount) throws SomeObjectIsNullException {
        if (startingNumber == null || incrementAmount == null) {
            throw new SomeObjectIsNullException();
        }
        return BigInteger.
                valueOf(startingNumber.longValue()).
                add(BigInteger.
                    valueOf(
                        incrementAmount.longValue()
                    )
                ).
                intValue();
    }
    
}
