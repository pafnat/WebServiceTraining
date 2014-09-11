
package com.reportingsales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeFactoSF1Part2ByZipResult" type="{http://reportingsales.com/}DefactoZip2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deFactoSF1Part2ByZipResult"
})
@XmlRootElement(name = "DeFactoSF1Part2ByZipResponse")
public class DeFactoSF1Part2ByZipResponse {

    @XmlElement(name = "DeFactoSF1Part2ByZipResult")
    protected DefactoZip2 deFactoSF1Part2ByZipResult;

    /**
     * Gets the value of the deFactoSF1Part2ByZipResult property.
     * 
     * @return
     *     possible object is
     *     {@link DefactoZip2 }
     *     
     */
    public DefactoZip2 getDeFactoSF1Part2ByZipResult() {
        return deFactoSF1Part2ByZipResult;
    }

    /**
     * Sets the value of the deFactoSF1Part2ByZipResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefactoZip2 }
     *     
     */
    public void setDeFactoSF1Part2ByZipResult(DefactoZip2 value) {
        this.deFactoSF1Part2ByZipResult = value;
    }

}
