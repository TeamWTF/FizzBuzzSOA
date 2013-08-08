
package com.enterprise.fizzbuzz.soa.client.moduluscondition;

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
@WebService(name = "ModulusCondition", targetNamespace = "http://ws.soa.fizzbuzz.enterprise.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ModulusCondition {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     * @throws SomeObjectIsNullException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isTrue", targetNamespace = "http://ws.soa.fizzbuzz.enterprise.com/", className = "com.enterprise.fizzbuzz.soa.client.moduluscondition.IsTrue")
    @ResponseWrapper(localName = "isTrueResponse", targetNamespace = "http://ws.soa.fizzbuzz.enterprise.com/", className = "com.enterprise.fizzbuzz.soa.client.moduluscondition.IsTrueResponse")
    @Action(input = "http://ws.soa.fizzbuzz.enterprise.com/ModulusCondition/isTrueRequest", output = "http://ws.soa.fizzbuzz.enterprise.com/ModulusCondition/isTrueResponse", fault = {
        @FaultAction(className = SomeObjectIsNullException_Exception.class, value = "http://ws.soa.fizzbuzz.enterprise.com/ModulusCondition/isTrue/Fault/SomeObjectIsNullException")
    })
    public Boolean isTrue(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Integer arg2)
        throws SomeObjectIsNullException_Exception
    ;

}
