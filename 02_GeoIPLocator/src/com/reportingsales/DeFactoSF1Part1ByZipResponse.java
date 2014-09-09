
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
 *         &lt;element name="DeFactoSF1Part1ByZipResult" type="{http://reportingsales.com/}bigZip" minOccurs="0"/>
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
    "deFactoSF1Part1ByZipResult"
})
@XmlRootElement(name = "DeFactoSF1Part1ByZipResponse")
public class DeFactoSF1Part1ByZipResponse {

    @XmlElement(name = "DeFactoSF1Part1ByZipResult")
    protected BigZip deFactoSF1Part1ByZipResult;

    /**
     * Gets the value of the deFactoSF1Part1ByZipResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigZip }
     *     
     */
    public BigZip getDeFactoSF1Part1ByZipResult() {
        return deFactoSF1Part1ByZipResult;
    }

    /**
     * Sets the value of the deFactoSF1Part1ByZipResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigZip }
     *     
     */
    public void setDeFactoSF1Part1ByZipResult(BigZip value) {
        this.deFactoSF1Part1ByZipResult = value;
    }

}
