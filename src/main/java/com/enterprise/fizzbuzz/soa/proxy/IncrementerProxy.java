package com.enterprise.fizzbuzz.soa.proxy;

import com.enterprise.fizzbuzz.soa.client.adapter.ClientAdapter;
import com.enterprise.fizzbuzz.soa.client.incrementer.IncrementerService;
import com.enterprise.fizzbuzz.soa.client.interfaces.Incrementer;
import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public class IncrementerProxy {

    private IncrementerProxy() {
    }
    
    public static Integer increment(Integer startingNumber, Integer incrementAmount) throws SomeObjectIsNullException {
        return ClientAdapter.createAdaptedInterface(IncrementerService.class, Incrementer.class).incrementBy(startingNumber, incrementAmount);
    }
    
}
