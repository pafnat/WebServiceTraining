package com.spring.jaxrs.service;

import com.spring.jaxrs.model.Employee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;

@XmlRootElement(name="employees")
@XmlAccessorType(XmlAccessType.NONE)
public class Employees {

    @XmlElement(name="employee")
    private Collection<Employee> employees;

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }

}

