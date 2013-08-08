package com.enterprise.fizzbuzz.soa.client.interfaces;

import com.enterprise.fizzbuzz.soa.client.incrementer.Incrementer;
import com.enterprise.fizzbuzz.soa.client.incrementer.SomeObjectIsNullException_Exception;
import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public class IncrementerAdapter {
    
    private Incrementer incrementer;

    public IncrementerAdapter(Incrementer incrementer) {
        this.incrementer = incrementer;
    }
    
    public Integer incrementBy(Integer startingNumber, Integer incrementAmount) throws SomeObjectIsNullException {
        try {
            return incrementer.incrementBy(startingNumber, incrementAmount);
        } catch (SomeObjectIsNullException_Exception exception) {
            throw new SomeObjectIsNullException(exception);
        }
    }
    
}
