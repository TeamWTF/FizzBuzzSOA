
package com.enterprise.fizzbuzz.soa.client.integertostring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.enterprise.fizzbuzz.soa.client.integertostring package. 
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

    private final static QName _ToStringResponse_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "toStringResponse");
    private final static QName _ToString_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "toString");
    private final static QName _SomeObjectIsNullException_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "SomeObjectIsNullException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.enterprise.fizzbuzz.soa.client.integertostring
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SomeObjectIsNullException }
     * 
     */
    public SomeObjectIsNullException createSomeObjectIsNullException() {
        return new SomeObjectIsNullException();
    }

    /**
     * Create an instance of {@link ToString }
     * 
     */
    public ToString createToString() {
        return new ToString();
    }

    /**
     * Create an instance of {@link ToStringResponse }
     * 
     */
    public ToStringResponse createToStringResponse() {
        return new ToStringResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "toStringResponse")
    public JAXBElement<ToStringResponse> createToStringResponse(ToStringResponse value) {
        return new JAXBElement<ToStringResponse>(_ToStringResponse_QNAME, ToStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "toString")
    public JAXBElement<ToString> createToString(ToString value) {
        return new JAXBElement<ToString>(_ToString_QNAME, ToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomeObjectIsNullException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "SomeObjectIsNullException")
    public JAXBElement<SomeObjectIsNullException> createSomeObjectIsNullException(SomeObjectIsNullException value) {
        return new JAXBElement<SomeObjectIsNullException>(_SomeObjectIsNullException_QNAME, SomeObjectIsNullException.class, null, value);
    }

}
