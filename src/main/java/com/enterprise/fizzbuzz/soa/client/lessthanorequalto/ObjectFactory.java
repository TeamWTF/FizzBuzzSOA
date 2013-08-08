
package com.enterprise.fizzbuzz.soa.client.lessthanorequalto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.enterprise.fizzbuzz.soa.client.lessthanorequalto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SomeObjectIsNullException_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "SomeObjectIsNullException");
    private final static QName _IsLessThanOrEqualToResponse_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "isLessThanOrEqualToResponse");
    private final static QName _IsLessThanOrEqualTo_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "isLessThanOrEqualTo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.enterprise.fizzbuzz.soa.client.lessthanorequalto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsLessThanOrEqualTo }
     * 
     */
    public IsLessThanOrEqualTo createIsLessThanOrEqualTo() {
        return new IsLessThanOrEqualTo();
    }

    /**
     * Create an instance of {@link IsLessThanOrEqualToResponse }
     * 
     */
    public IsLessThanOrEqualToResponse createIsLessThanOrEqualToResponse() {
        return new IsLessThanOrEqualToResponse();
    }

    /**
     * Create an instance of {@link SomeObjectIsNullException }
     * 
     */
    public SomeObjectIsNullException createSomeObjectIsNullException() {
        return new SomeObjectIsNullException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomeObjectIsNullException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "SomeObjectIsNullException")
    public JAXBElement<SomeObjectIsNullException> createSomeObjectIsNullException(SomeObjectIsNullException value) {
        return new JAXBElement<SomeObjectIsNullException>(_SomeObjectIsNullException_QNAME, SomeObjectIsNullException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLessThanOrEqualToResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "isLessThanOrEqualToResponse")
    public JAXBElement<IsLessThanOrEqualToResponse> createIsLessThanOrEqualToResponse(IsLessThanOrEqualToResponse value) {
        return new JAXBElement<IsLessThanOrEqualToResponse>(_IsLessThanOrEqualToResponse_QNAME, IsLessThanOrEqualToResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLessThanOrEqualTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "isLessThanOrEqualTo")
    public JAXBElement<IsLessThanOrEqualTo> createIsLessThanOrEqualTo(IsLessThanOrEqualTo value) {
        return new JAXBElement<IsLessThanOrEqualTo>(_IsLessThanOrEqualTo_QNAME, IsLessThanOrEqualTo.class, null, value);
    }

}
