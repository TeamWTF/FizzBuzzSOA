package com.enterprise.fizzbuzz.soa.client.interfaces;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public interface ModulusCondition {
    
    public Boolean isTrue(Integer value, Integer modulus, Integer expectedRemainder) throws SomeObjectIsNullException;
    
}
