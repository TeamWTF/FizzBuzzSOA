
package com.enterprise.fizzbuzz.soa.client.incrementer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.enterprise.fizzbuzz.soa.client.incrementer package. 
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

    private final static QName _IncrementBy_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "incrementBy");
    private final static QName _SomeObjectIsNullException_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "SomeObjectIsNullException");
    private final static QName _IncrementByResponse_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "incrementByResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.enterprise.fizzbuzz.soa.client.incrementer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IncrementByResponse }
     * 
     */
    public IncrementByResponse createIncrementByResponse() {
        return new IncrementByResponse();
    }

    /**
     * Create an instance of {@link SomeObjectIsNullException }
     * 
     */
    public SomeObjectIsNullException createSomeObjectIsNullException() {
        return new SomeObjectIsNullException();
    }

    /**
     * Create an instance of {@link IncrementBy }
     * 
     */
    public IncrementBy createIncrementBy() {
        return new IncrementBy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncrementBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "incrementBy")
    public JAXBElement<IncrementBy> createIncrementBy(IncrementBy value) {
        return new JAXBElement<IncrementBy>(_IncrementBy_QNAME, IncrementBy.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IncrementByResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "incrementByResponse")
    public JAXBElement<IncrementByResponse> createIncrementByResponse(IncrementByResponse value) {
        return new JAXBElement<IncrementByResponse>(_IncrementByResponse_QNAME, IncrementByResponse.class, null, value);
    }

}
