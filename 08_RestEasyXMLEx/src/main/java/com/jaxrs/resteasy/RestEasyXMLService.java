package com.jaxrs.resteasy;

import com.jaxrs.resteasy.model.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/restEasyXML")
public class RestEasyXMLService {

    @GET
    @Path("/empDtls")
    @Produces("application/xml")
    public Employee getEmpDetails() {
        Employee emp = new Employee();
        emp.setEmpdId(1);
        emp.setFirstName("firstName");
        emp.setLastName("lastName");
        return emp;
    }

}
