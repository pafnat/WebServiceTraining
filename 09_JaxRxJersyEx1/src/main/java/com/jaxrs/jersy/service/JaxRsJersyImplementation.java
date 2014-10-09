package com.jaxrs.jersy.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/*
 http://localhost:8080/JaxRxJerseyEx1/jersy/jersyImpl/getMsg
*/

@Path("/jersyImpl")
public class JaxRsJersyImplementation {



    @GET
    @Path("/getMsg")
    public Response getJersyImplMessage() {

        return Response.status(200).entity("This is Jersy Implmentation").build();

    }

}
