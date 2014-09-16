package com.spring.ws;

import com.spring.ws.service.EmployeeService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService // Annotation required for the SEI (Service Endpoint Interface).
public class JavaWSSpringIntegration {

    //Invoke the Spring Service layer classes
    // dependency injection

    EmployeeService jaxwsSpring;

    @WebMethod(exclude = true) // Exposing the Public method and Include Inherited methods
    public void setJaxwsSpring(EmployeeService jaxwsSpring) {

        this.jaxwsSpring = jaxwsSpring;

    }

    @WebMethod(operationName = "getjaxwsSpringd")
    public String getJaxwsSpringd() {

        return jaxwsSpring.getJaxwsSpring();

    }

}
