
package com.enterprise.fizzbuzz.soa.client.incrementer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IncrementerService", targetNamespace = "http://ws.soa.fizzbuzz.enterprise.com/", wsdlLocation = "http://localhost:8080/IncrementerService/Incrementer?wsdl")
public class IncrementerService
    extends Service
{

    private final static URL INCREMENTERSERVICE_WSDL_LOCATION;
    private final static WebServiceException INCREMENTERSERVICE_EXCEPTION;
    private final static QName INCREMENTERSERVICE_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "IncrementerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/IncrementerService/Incrementer?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INCREMENTERSERVICE_WSDL_LOCATION = url;
        INCREMENTERSERVICE_EXCEPTION = e;
    }

    public IncrementerService() {
        super(__getWsdlLocation(), INCREMENTERSERVICE_QNAME);
    }

    /**
     * 
     * @return
     *     returns Incrementer
     */
    @WebEndpoint(name = "IncrementerPort")
    public Incrementer getIncrementerPort() {
        return super.getPort(new QName("http://ws.soa.fizzbuzz.enterprise.com/", "IncrementerPort"), Incrementer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Incrementer
     */
    @WebEndpoint(name = "IncrementerPort")
    public Incrementer getIncrementerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.soa.fizzbuzz.enterprise.com/", "IncrementerPort"), Incrementer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INCREMENTERSERVICE_EXCEPTION!= null) {
            throw INCREMENTERSERVICE_EXCEPTION;
        }
        return INCREMENTERSERVICE_WSDL_LOCATION;
    }

}
