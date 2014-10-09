package com.jaxrs.jersy.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/formParam")
public class JerseyFromParameterHandling {

    @POST
    @Path("/createEmp")
    public Response createEmployee(@FormParam("empFirstName") String firstName,
                                   @FormParam("age") String age) {

        String responseMsg = "Employee with Name = " + firstName + " and age " + age + " Created successfully";

        return Response.status(200).entity(responseMsg).build();

    }



}
