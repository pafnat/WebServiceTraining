
package com.reportingsales;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reportingsales package. 
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

    private final static QName _BigName_QNAME = new QName("http://reportingsales.com/", "bigName");
    private final static QName _ArrayOfDefactoName2_QNAME = new QName("http://reportingsales.com/", "ArrayOfDefactoName2");
    private final static QName _BigZip_QNAME = new QName("http://reportingsales.com/", "bigZip");
    private final static QName _DefactoZip2_QNAME = new QName("http://reportingsales.com/", "DefactoZip2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reportingsales
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeFactoSF1Part1ByNameStateResponse }
     * 
     */
    public DeFactoSF1Part1ByNameStateResponse createDeFactoSF1Part1ByNameStateResponse() {
        return new DeFactoSF1Part1ByNameStateResponse();
    }

    /**
     * Create an instance of {@link BigName }
     * 
     */
    public BigName createBigName() {
        return new BigName();
    }

    /**
     * Create an instance of {@link ArrayOfDefactoName2 }
     * 
     */
    public ArrayOfDefactoName2 createArrayOfDefactoName2() {
        return new ArrayOfDefactoName2();
    }

    /**
     * Create an instance of {@link DefactoZip2 }
     * 
     */
    public DefactoZip2 createDefactoZip2() {
        return new DefactoZip2();
    }

    /**
     * Create an instance of {@link BigZip }
     * 
     */
    public BigZip createBigZip() {
        return new BigZip();
    }

    /**
     * Create an instance of {@link DeFactoSF1Part1ByZip }
     * 
     */
    public DeFactoSF1Part1ByZip createDeFactoSF1Part1ByZip() {
        return new DeFactoSF1Part1ByZip();
    }

    /**
     * Create an instance of {@link DeFactoSF1Part2ByZipResponse }
     * 
     */
    public DeFactoSF1Part2ByZipResponse createDeFactoSF1Part2ByZipResponse() {
        return new DeFactoSF1Part2ByZipResponse();
    }

    /**
     * Create an instance of {@link DeFactoSF1Part2ByZip }
     * 
     */
    public DeFactoSF1Part2ByZip createDeFactoSF1Part2ByZip() {
        return new DeFactoSF1Part2ByZip();
    }

    /**
     * Create an instance of {@link DeFactoSF1Part1ByZipResponse }
     * 
     */
    public DeFactoSF1Part1ByZipResponse createDeFactoSF1Part1ByZipResponse() {
        return new DeFactoSF1Part1ByZipResponse();
    }

    /**
     * Create an instance of {@link DeFactoSF1Part1ByNameState }
     * 
     */
    public DeFactoSF1Part1ByNameState createDeFactoSF1Part1ByNameState() {
        return new DeFactoSF1Part1ByNameState();
    }

    /**
     * Create an instance of {@link DeFactoSF1Part2ByNameState }
     * 
     */
    public DeFactoSF1Part2ByNameState createDeFactoSF1Part2ByNameState() {
        return new DeFactoSF1Part2ByNameState();
    }

    /**
     * Create an instance of {@link DeFactoSF1Part2ByNameStateResponse }
     * 
     */
    public DeFactoSF1Part2ByNameStateResponse createDeFactoSF1Part2ByNameStateResponse() {
        return new DeFactoSF1Part2ByNameStateResponse();
    }

    /**
     * Create an instance of {@link DefactoName2 }
     * 
     */
    public DefactoName2 createDefactoName2() {
        return new DefactoName2();
    }

    /**
     * Create an instance of {@link EntityKey }
     * 
     */
    public EntityKey createEntityKey() {
        return new EntityKey();
    }

    /**
     * Create an instance of {@link ArrayOfEntityKeyMember }
     * 
     */
    public ArrayOfEntityKeyMember createArrayOfEntityKeyMember() {
        return new ArrayOfEntityKeyMember();
    }

    /**
     * Create an instance of {@link EntityKeyMember }
     * 
     */
    public EntityKeyMember createEntityKeyMember() {
        return new EntityKeyMember();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reportingsales.com/", name = "bigName")
    public JAXBElement<BigName> createBigName(BigName value) {
        return new JAXBElement<BigName>(_BigName_QNAME, BigName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDefactoName2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reportingsales.com/", name = "ArrayOfDefactoName2")
    public JAXBElement<ArrayOfDefactoName2> createArrayOfDefactoName2(ArrayOfDefactoName2 value) {
        return new JAXBElement<ArrayOfDefactoName2>(_ArrayOfDefactoName2_QNAME, ArrayOfDefactoName2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigZip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reportingsales.com/", name = "bigZip")
    public JAXBElement<BigZip> createBigZip(BigZip value) {
        return new JAXBElement<BigZip>(_BigZip_QNAME, BigZip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefactoZip2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://reportingsales.com/", name = "DefactoZip2")
    public JAXBElement<DefactoZip2> createDefactoZip2(DefactoZip2 value) {
        return new JAXBElement<DefactoZip2>(_DefactoZip2_QNAME, DefactoZip2 .class, null, value);
    }

}
