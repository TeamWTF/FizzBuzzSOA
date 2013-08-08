
package com.enterprise.fizzbuzz.soa.client.moduluscondition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.enterprise.fizzbuzz.soa.client.moduluscondition package. 
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

    private final static QName _IsTrue_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "isTrue");
    private final static QName _IsTrueResponse_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "isTrueResponse");
    private final static QName _SomeObjectIsNullException_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "SomeObjectIsNullException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.enterprise.fizzbuzz.soa.client.moduluscondition
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
     * Create an instance of {@link IsTrueResponse }
     * 
     */
    public IsTrueResponse createIsTrueResponse() {
        return new IsTrueResponse();
    }

    /**
     * Create an instance of {@link IsTrue }
     * 
     */
    public IsTrue createIsTrue() {
        return new IsTrue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsTrue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "isTrue")
    public JAXBElement<IsTrue> createIsTrue(IsTrue value) {
        return new JAXBElement<IsTrue>(_IsTrue_QNAME, IsTrue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsTrueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "isTrueResponse")
    public JAXBElement<IsTrueResponse> createIsTrueResponse(IsTrueResponse value) {
        return new JAXBElement<IsTrueResponse>(_IsTrueResponse_QNAME, IsTrueResponse.class, null, value);
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
