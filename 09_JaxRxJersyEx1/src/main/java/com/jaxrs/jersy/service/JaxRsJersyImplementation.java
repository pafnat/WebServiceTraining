package com.jaxrs.jersy.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

    @GET
    @Path("/{param}")
    public Response getJersyParameter(@PathParam("param") String paramValue) {
        System.out.println("Test = " + paramValue);
        String handlerParameter = paramValue + " is received through the URL Query String Parameter...";

        // Any Business logic Required can be constructed here...

        return Response.status(200).entity(handlerParameter).build();

    }

}
