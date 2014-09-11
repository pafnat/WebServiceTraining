
package com.reportingsales;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDefactoName2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDefactoName2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefactoName2" type="{http://reportingsales.com/}DefactoName2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDefactoName2", propOrder = {
    "defactoName2"
})
public class ArrayOfDefactoName2 {

    @XmlElement(name = "DefactoName2", nillable = true)
    protected List<DefactoName2> defactoName2;

    /**
     * Gets the value of the defactoName2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defactoName2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefactoName2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefactoName2 }
     * 
     * 
     */
    public List<DefactoName2> getDefactoName2() {
        if (defactoName2 == null) {
            defactoName2 = new ArrayList<DefactoName2>();
        }
        return this.defactoName2;
    }

}
