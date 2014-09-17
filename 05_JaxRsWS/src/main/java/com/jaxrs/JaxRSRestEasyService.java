package com.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


//http://localhost:8080/JaxRsWS/restwsex/

@Path("/restwsex")
public class JaxRSRestEasyService {

	
	//http://localhost:8080/JaxRsWS/restwsex/message
		
	@GET
	@Path("/message")
	public Response restMessageDisply() {
		String message = "Welcome to Restfull web Services..";
		
		
		return Response.status(200).entity(message).build();
	}

	
	//http://localhost:8080/JaxRsWS/restwsex/dispDate
	
	@GET
	@Path("/dispDate")
	public Response restDateDisply() {
		String message = "Welcome to Restfull web Services..";
		return Response.status(200).entity(message).build();
	}

}
