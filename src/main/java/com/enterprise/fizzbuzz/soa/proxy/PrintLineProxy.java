package com.enterprise.fizzbuzz.soa.proxy;

import com.enterprise.fizzbuzz.soa.client.adapter.ClientAdapter;
import com.enterprise.fizzbuzz.soa.client.interfaces.PrintLine;
import com.enterprise.fizzbuzz.soa.client.printline.PrintLineService;
import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;

public class PrintLineProxy {
    private PrintLineProxy() {
    }
    
    public static String printLine(String message, String text) throws SomeObjectIsNullException {        
        return ClientAdapter.createAdaptedInterface(PrintLineService.class, PrintLine.class).printLine(message, text);
    }
    
    public static String printLine(String message, Integer value) throws SomeObjectIsNullException {
        return printLine(message, IntegerToStringProxy.toString(value));
    }    
}
