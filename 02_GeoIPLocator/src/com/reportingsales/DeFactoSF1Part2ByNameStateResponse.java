
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
 *         &lt;element name="DeFactoSF1Part2ByNameStateResult" type="{http://reportingsales.com/}ArrayOfDefactoName2" minOccurs="0"/>
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
    "deFactoSF1Part2ByNameStateResult"
})
@XmlRootElement(name = "DeFactoSF1Part2ByNameStateResponse")
public class DeFactoSF1Part2ByNameStateResponse {

    @XmlElement(name = "DeFactoSF1Part2ByNameStateResult")
    protected ArrayOfDefactoName2 deFactoSF1Part2ByNameStateResult;

    /**
     * Gets the value of the deFactoSF1Part2ByNameStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDefactoName2 }
     *     
     */
    public ArrayOfDefactoName2 getDeFactoSF1Part2ByNameStateResult() {
        return deFactoSF1Part2ByNameStateResult;
    }

    /**
     * Sets the value of the deFactoSF1Part2ByNameStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDefactoName2 }
     *     
     */
    public void setDeFactoSF1Part2ByNameStateResult(ArrayOfDefactoName2 value) {
        this.deFactoSF1Part2ByNameStateResult = value;
    }

}
