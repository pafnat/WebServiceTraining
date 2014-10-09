package com.jaxrs.jersy.service;

import com.jaxrs.jersy.model.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*

http://localhost:8080/JaxRxJerseyEx1/jersey/generateXml/getEmpDtl


 */


@Path("/generateXml")
public class JerseyXMLResponse {

    @GET
    @Path("getEmpDtl")
    @Produces(MediaType.APPLICATION_XML)
    public Employee getEmployeeDetails() {

        Employee emp = new Employee();
        emp.setAge(2);
        emp.setFirstName("Ivan");
        return emp;

    }

}
