package com.enterprise.fizzbuzz.soa.ws;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;
import com.enterprise.fizzbuzz.soa.interceptors.TimingInterceptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;

@WebService
@Stateless
//@Interceptors(TimingInterceptor.class)
public class PrintLine {
    
    public String printLine(String currentString, String message) throws SomeObjectIsNullException {
        if (currentString == null || message == null) {
            throw new SomeObjectIsNullException();
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.print(currentString);
        printWriter.println(message);
        return stringWriter.toString();
    }
    
}
