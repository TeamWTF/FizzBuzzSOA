package com.enterprise.fizzbuzz.soa.client.interfaces;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public interface Modulus {
    
    public Integer modulus(Integer number, Integer modulus) throws SomeObjectIsNullException;
    
}
