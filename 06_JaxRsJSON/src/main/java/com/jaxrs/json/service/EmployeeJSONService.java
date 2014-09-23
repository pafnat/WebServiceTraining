package com.jaxrs.json.service;

import com.jaxrs.json.model.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("Employee/Json")
public class EmployeeJSONService {


    // return back complete model class
    @GET
    @Path("empList")
    @Produces("application/json")
    public Employee getEmployeeList() {

        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setFirstName("AMAN");
        emp.setLastName("last name");

        return emp;
    }


}
