package com.enterprise.fizzbuzz.soa.client.interfaces;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public interface IntegerToString {
    
    public String toString(Integer value) throws SomeObjectIsNullException;
    
}
