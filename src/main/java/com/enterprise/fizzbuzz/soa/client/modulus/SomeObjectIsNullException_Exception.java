
package com.enterprise.fizzbuzz.soa.client.modulus;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "SomeObjectIsNullException", targetNamespace = "http://ws.soa.fizzbuzz.enterprise.com/")
public class SomeObjectIsNullException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SomeObjectIsNullException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public SomeObjectIsNullException_Exception(String message, SomeObjectIsNullException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public SomeObjectIsNullException_Exception(String message, SomeObjectIsNullException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.enterprise.fizzbuzz.soa.client.modulus.SomeObjectIsNullException
     */
    public SomeObjectIsNullException getFaultInfo() {
        return faultInfo;
    }

}
