
package com.reportingsales;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEntityKeyMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEntityKeyMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityKeyMember" type="{http://reportingsales.com/}EntityKeyMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntityKeyMember", propOrder = {
    "entityKeyMember"
})
public class ArrayOfEntityKeyMember {

    @XmlElement(name = "EntityKeyMember", nillable = true)
    protected List<EntityKeyMember> entityKeyMember;

    /**
     * Gets the value of the entityKeyMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityKeyMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityKeyMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityKeyMember }
     * 
     * 
     */
    public List<EntityKeyMember> getEntityKeyMember() {
        if (entityKeyMember == null) {
            entityKeyMember = new ArrayList<EntityKeyMember>();
        }
        return this.entityKeyMember;
    }

}
