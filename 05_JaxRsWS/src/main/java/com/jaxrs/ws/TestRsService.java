package com.jaxrs.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.ResponseCache;

// http://localhost:08080/JaxRsWS/rest/testPath/test
@Path("testPath")
public class TestRsService {


    public TestRsService() {
        System.out.println("We are in Constructor...");
    }

    @GET
    @Path("/test")
    public Response testMethod() {

        String message = "This is a test server class...";

        return Response.status(200).entity(message).build();
    }


}
