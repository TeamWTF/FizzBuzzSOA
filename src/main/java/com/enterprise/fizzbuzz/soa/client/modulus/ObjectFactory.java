
package com.enterprise.fizzbuzz.soa.client.modulus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.enterprise.fizzbuzz.soa.client.modulus package. 
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

    private final static QName _Modulus_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "modulus");
    private final static QName _SomeObjectIsNullException_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "SomeObjectIsNullException");
    private final static QName _ModulusResponse_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "modulusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.enterprise.fizzbuzz.soa.client.modulus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModulusResponse }
     * 
     */
    public ModulusResponse createModulusResponse() {
        return new ModulusResponse();
    }

    /**
     * Create an instance of {@link SomeObjectIsNullException }
     * 
     */
    public SomeObjectIsNullException createSomeObjectIsNullException() {
        return new SomeObjectIsNullException();
    }

    /**
     * Create an instance of {@link Modulus_Type }
     * 
     */
    public Modulus_Type createModulus_Type() {
        return new Modulus_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modulus_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "modulus")
    public JAXBElement<Modulus_Type> createModulus(Modulus_Type value) {
        return new JAXBElement<Modulus_Type>(_Modulus_QNAME, Modulus_Type.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ModulusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "modulusResponse")
    public JAXBElement<ModulusResponse> createModulusResponse(ModulusResponse value) {
        return new JAXBElement<ModulusResponse>(_ModulusResponse_QNAME, ModulusResponse.class, null, value);
    }

}
