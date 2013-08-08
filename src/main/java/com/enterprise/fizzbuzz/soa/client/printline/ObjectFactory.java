
package com.enterprise.fizzbuzz.soa.client.printline;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.enterprise.fizzbuzz.soa.client.printline package. 
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

    private final static QName _PrintLine_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "printLine");
    private final static QName _SomeObjectIsNullException_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "SomeObjectIsNullException");
    private final static QName _PrintLineResponse_QNAME = new QName("http://ws.soa.fizzbuzz.enterprise.com/", "printLineResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.enterprise.fizzbuzz.soa.client.printline
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintLineResponse }
     * 
     */
    public PrintLineResponse createPrintLineResponse() {
        return new PrintLineResponse();
    }

    /**
     * Create an instance of {@link SomeObjectIsNullException }
     * 
     */
    public SomeObjectIsNullException createSomeObjectIsNullException() {
        return new SomeObjectIsNullException();
    }

    /**
     * Create an instance of {@link PrintLine_Type }
     * 
     */
    public PrintLine_Type createPrintLine_Type() {
        return new PrintLine_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintLine_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "printLine")
    public JAXBElement<PrintLine_Type> createPrintLine(PrintLine_Type value) {
        return new JAXBElement<PrintLine_Type>(_PrintLine_QNAME, PrintLine_Type.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintLineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soa.fizzbuzz.enterprise.com/", name = "printLineResponse")
    public JAXBElement<PrintLineResponse> createPrintLineResponse(PrintLineResponse value) {
        return new JAXBElement<PrintLineResponse>(_PrintLineResponse_QNAME, PrintLineResponse.class, null, value);
    }

}
