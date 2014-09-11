
package com.reportingsales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntitySetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityContainerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityKeyValues" type="{http://reportingsales.com/}ArrayOfEntityKeyMember" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityKey", propOrder = {
    "entitySetName",
    "entityContainerName",
    "entityKeyValues"
})
public class EntityKey {

    @XmlElement(name = "EntitySetName")
    protected String entitySetName;
    @XmlElement(name = "EntityContainerName")
    protected String entityContainerName;
    @XmlElement(name = "EntityKeyValues")
    protected ArrayOfEntityKeyMember entityKeyValues;

    /**
     * Gets the value of the entitySetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitySetName() {
        return entitySetName;
    }

    /**
     * Sets the value of the entitySetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitySetName(String value) {
        this.entitySetName = value;
    }

    /**
     * Gets the value of the entityContainerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityContainerName() {
        return entityContainerName;
    }

    /**
     * Sets the value of the entityContainerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityContainerName(String value) {
        this.entityContainerName = value;
    }

    /**
     * Gets the value of the entityKeyValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityKeyMember }
     *     
     */
    public ArrayOfEntityKeyMember getEntityKeyValues() {
        return entityKeyValues;
    }

    /**
     * Sets the value of the entityKeyValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityKeyMember }
     *     
     */
    public void setEntityKeyValues(ArrayOfEntityKeyMember value) {
        this.entityKeyValues = value;
    }

}
