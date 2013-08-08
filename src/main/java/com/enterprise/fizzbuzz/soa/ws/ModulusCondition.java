package com.enterprise.fizzbuzz.soa.ws;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;
import com.enterprise.fizzbuzz.soa.interceptors.TimingInterceptor;
import static com.enterprise.fizzbuzz.soa.proxy.ModulusProxy.modulus;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;


@WebService
@Stateless
//@Interceptors(TimingInterceptor.class)
public class ModulusCondition {
    
    public Boolean isTrue(Integer value, Integer modulus, Integer expectedRemainder) throws SomeObjectIsNullException {
        if (value == null || modulus == null) {
            throw new SomeObjectIsNullException();
        }  
        return modulus(value, modulus).equals(expectedRemainder);
    }
    
}
