package com.enterprise.fizzbuzz.soa.proxy;

import com.enterprise.fizzbuzz.soa.client.adapter.ClientAdapter;
import com.enterprise.fizzbuzz.soa.client.interfaces.LessThanOrEqualTo;
import com.enterprise.fizzbuzz.soa.client.lessthanorequalto.LessThanOrEqualToService;
import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public class LassThanOrEqualToProxy {
   
    private LassThanOrEqualToProxy() {
    }

    public static Boolean lessThanOrEqualTo(Integer number, Integer value) throws SomeObjectIsNullException {
        return ClientAdapter.createAdaptedInterface(LessThanOrEqualToService.class, LessThanOrEqualTo.class).isLessThanOrEqualTo(number, value);
    }    
    
}
