package com.spring.jaxws.ws;

import com.spring.jaxws.service.EmployeeService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class JaxWSSpringIntService {

    //Invoke the Spring Service layer classes
    // dependency injection

    EmployeeService jaxwsSpring;


    @WebMethod(exclude = true)
    public void setJaxwsSpring(EmployeeService jaxwsSpring) {
        this.jaxwsSpring = jaxwsSpring;
    }

    @WebMethod(operationName = "getJaxwsSpring()")
    public String getJaxwsSpring() {
        return jaxwsSpring.getJaxwsSpring();
    }



}
