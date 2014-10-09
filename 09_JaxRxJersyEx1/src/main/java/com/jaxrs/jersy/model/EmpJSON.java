package com.jaxrs.jersy.model;

import javax.xml.bind.annotation.XmlElement;

public class EmpJSON {

    String firstName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ëmployee [age="+ age + " firstName=" + firstName + "]";
    }
}
