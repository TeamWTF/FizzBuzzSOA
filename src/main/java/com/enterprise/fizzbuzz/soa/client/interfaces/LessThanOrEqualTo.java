package com.enterprise.fizzbuzz.soa.client.interfaces;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public interface LessThanOrEqualTo {
    
    public Boolean isLessThanOrEqualTo(Integer number, Integer value) throws SomeObjectIsNullException;
    
}
