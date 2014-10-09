package com.jaxrs.jersy.service;

import com.jaxrs.jersy.model.EmpJSON;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/jsonObject")
public class JersyJSONImpl {

    //http://localhost:8080/JaxRxJerseyEx1/jersey/jsonObject/getJSONEmp

    @GET
    @Path("getJSONEmp")
    @Produces(MediaType.APPLICATION_JSON)
    public EmpJSON getEmpInJSON() {
        EmpJSON empJSON = new EmpJSON();
        empJSON.setAge(3);
        empJSON.setFirstName("JSON name");
        return empJSON;

    }
/*
    //http://localhost:8080/JaxRxJerseyEx1/jersey/jsonObject/postJSONEmp

    @POST
    @Path("postJSONEmp")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmpInJSON(EmpJSON empJSON) {

        String resp = "Employee retrieved with name = " + empJSON.getFirstName();

        return Response.status(200).entity(resp).build();

    }*/

}
