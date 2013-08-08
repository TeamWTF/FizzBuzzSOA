package com.enterprise.fizzbuzz.soa.client.interfaces;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public interface Incrementer {
    
    public Integer incrementBy(Integer startingNumber, Integer incrementAmount) throws SomeObjectIsNullException;
    
}
