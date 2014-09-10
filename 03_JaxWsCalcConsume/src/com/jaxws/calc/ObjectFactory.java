
package com.jaxws.calc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jaxws.calc package. 
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

    private final static QName _CalProductResponse_QNAME = new QName("http://calc.jaxws.com/", "calProductResponse");
    private final static QName _BookTicketResponse_QNAME = new QName("http://calc.jaxws.com/", "bookTicketResponse");
    private final static QName _CalProduct_QNAME = new QName("http://calc.jaxws.com/", "calProduct");
    private final static QName _AddResponse_QNAME = new QName("http://calc.jaxws.com/", "addResponse");
    private final static QName _BookTicket_QNAME = new QName("http://calc.jaxws.com/", "bookTicket");
    private final static QName _Add_QNAME = new QName("http://calc.jaxws.com/", "add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jaxws.calc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link BookTicket }
     * 
     */
    public BookTicket createBookTicket() {
        return new BookTicket();
    }

    /**
     * Create an instance of {@link CalProductResponse }
     * 
     */
    public CalProductResponse createCalProductResponse() {
        return new CalProductResponse();
    }

    /**
     * Create an instance of {@link BookTicketResponse }
     * 
     */
    public BookTicketResponse createBookTicketResponse() {
        return new BookTicketResponse();
    }

    /**
     * Create an instance of {@link CalProduct }
     * 
     */
    public CalProduct createCalProduct() {
        return new CalProduct();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.jaxws.com/", name = "calProductResponse")
    public JAXBElement<CalProductResponse> createCalProductResponse(CalProductResponse value) {
        return new JAXBElement<CalProductResponse>(_CalProductResponse_QNAME, CalProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.jaxws.com/", name = "bookTicketResponse")
    public JAXBElement<BookTicketResponse> createBookTicketResponse(BookTicketResponse value) {
        return new JAXBElement<BookTicketResponse>(_BookTicketResponse_QNAME, BookTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.jaxws.com/", name = "calProduct")
    public JAXBElement<CalProduct> createCalProduct(CalProduct value) {
        return new JAXBElement<CalProduct>(_CalProduct_QNAME, CalProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.jaxws.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.jaxws.com/", name = "bookTicket")
    public JAXBElement<BookTicket> createBookTicket(BookTicket value) {
        return new JAXBElement<BookTicket>(_BookTicket_QNAME, BookTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.jaxws.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
