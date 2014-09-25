package com.jaxrs.resteasy.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
public class Employee {

    private int empdId;
    private String firstName;
    private String lastName;

    @XmlElement
    public int getEmpdId() {
        return empdId;
    }

    public void setEmpdId(int empdId) {
        this.empdId = empdId;
    }

    @XmlElement
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
