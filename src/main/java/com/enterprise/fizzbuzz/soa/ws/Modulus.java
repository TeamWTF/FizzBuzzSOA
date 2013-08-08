package com.enterprise.fizzbuzz.soa.ws;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;
import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService
@Stateless
//@Interceptors(TimingInterceptor.class)
public class Modulus {

    public Integer modulus(Integer number, Integer modulus) throws SomeObjectIsNullException {
        if (number == null || modulus == null) {
            throw new SomeObjectIsNullException();
        }
        return number.intValue() % modulus.intValue();
    }
    
}
