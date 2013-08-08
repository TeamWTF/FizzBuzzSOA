
package com.enterprise.fizzbuzz.soa.client.modulus;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Modulus", targetNamespace = "http://ws.soa.fizzbuzz.enterprise.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Modulus {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Integer
     * @throws SomeObjectIsNullException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modulus", targetNamespace = "http://ws.soa.fizzbuzz.enterprise.com/", className = "com.enterprise.fizzbuzz.soa.client.modulus.Modulus_Type")
    @ResponseWrapper(localName = "modulusResponse", targetNamespace = "http://ws.soa.fizzbuzz.enterprise.com/", className = "com.enterprise.fizzbuzz.soa.client.modulus.ModulusResponse")
    @Action(input = "http://ws.soa.fizzbuzz.enterprise.com/Modulus/modulusRequest", output = "http://ws.soa.fizzbuzz.enterprise.com/Modulus/modulusResponse", fault = {
        @FaultAction(className = SomeObjectIsNullException_Exception.class, value = "http://ws.soa.fizzbuzz.enterprise.com/Modulus/modulus/Fault/SomeObjectIsNullException")
    })
    public Integer modulus(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1)
        throws SomeObjectIsNullException_Exception
    ;

}