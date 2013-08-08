package com.enterprise.fizzbuzz.soa.proxy;

import com.enterprise.fizzbuzz.soa.client.adapter.ClientAdapter;
import com.enterprise.fizzbuzz.soa.client.interfaces.ModulusCondition;
import com.enterprise.fizzbuzz.soa.client.moduluscondition.ModulusConditionService;
import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public class ModulusConditionProxy {
    
    private ModulusConditionProxy() {
    }
    
    public static Boolean isMod(Integer value, Integer modulus) throws SomeObjectIsNullException {
        return ClientAdapter.createAdaptedInterface(ModulusConditionService.class, ModulusCondition.class).isTrue(value, modulus, 0);
    }
}
