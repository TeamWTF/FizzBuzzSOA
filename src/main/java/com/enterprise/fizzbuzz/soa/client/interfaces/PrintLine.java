package com.enterprise.fizzbuzz.soa.client.interfaces;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public interface PrintLine {
    
    public String printLine(String currentString, String message) throws SomeObjectIsNullException;
    
}
