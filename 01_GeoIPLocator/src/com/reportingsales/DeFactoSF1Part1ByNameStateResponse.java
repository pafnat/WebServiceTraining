
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
 *         &lt;element name="DeFactoSF1Part1ByNameStateResult" type="{http://reportingsales.com/}bigName" minOccurs="0"/>
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
    "deFactoSF1Part1ByNameStateResult"
})
@XmlRootElement(name = "DeFactoSF1Part1ByNameStateResponse")
public class DeFactoSF1Part1ByNameStateResponse {

    @XmlElement(name = "DeFactoSF1Part1ByNameStateResult")
    protected BigName deFactoSF1Part1ByNameStateResult;

    /**
     * Gets the value of the deFactoSF1Part1ByNameStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigName }
     *     
     */
    public BigName getDeFactoSF1Part1ByNameStateResult() {
        return deFactoSF1Part1ByNameStateResult;
    }

    /**
     * Sets the value of the deFactoSF1Part1ByNameStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigName }
     *     
     */
    public void setDeFactoSF1Part1ByNameStateResult(BigName value) {
        this.deFactoSF1Part1ByNameStateResult = value;
    }

}
