package com.enterprise.fizzbuzz.soa.proxy;

import com.enterprise.fizzbuzz.soa.client.adapter.ClientAdapter;
import com.enterprise.fizzbuzz.soa.client.integertostring.IntegerToStringService;
import com.enterprise.fizzbuzz.soa.client.interfaces.IntegerToString;
import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public class IntegerToStringProxy {

    private IntegerToStringProxy() {
    }

    public static String toString(Integer value) throws SomeObjectIsNullException {
        return ClientAdapter.createAdaptedInterface(IntegerToStringService.class, IntegerToString.class).toString(value);
    }
}
