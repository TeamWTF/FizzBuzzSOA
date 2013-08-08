package com.enterprise.fizzbuzz.soa.proxy;

import com.enterprise.fizzbuzz.soa.client.adapter.ClientAdapter;
import com.enterprise.fizzbuzz.soa.client.interfaces.Modulus;
import com.enterprise.fizzbuzz.soa.client.modulus.ModulusService;
import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public class ModulusProxy {
    
    private ModulusProxy() {
    }
    
    public static Integer modulus(Integer number, Integer modulus) throws SomeObjectIsNullException {
        return ClientAdapter.createAdaptedInterface(ModulusService.class, Modulus.class).modulus(number, modulus);
    }
}
