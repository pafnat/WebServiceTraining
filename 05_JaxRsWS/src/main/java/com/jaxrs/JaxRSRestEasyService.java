package com.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.Calendar;
import java.util.Date;

// for messages we will have this url
// http://localhost:8080/JaxRsWS/rest/restwsex/

@Path("/restwsex")
public class JaxRSRestEasyService {

	
	//http://localhost:8080/JaxRsWS/restwsex/message

    public JaxRSRestEasyService() {
        System.out.println("We are in JaxRSRestEasyService Constructor...");
    }
		
	@GET
	@Path("/message")
	public Response restMessageDisply() {
		String message = "Welcome to Restfull web Services..";

        //And You need to try the data from other classes/alyers/ May  be create a JDBC /Hibernate connection to the DB and pull data from database and send back to the consumer



        return Response.status(200).entity(message).build();
	}

	
	//http://localhost:8080/JaxRsWS/restwsex/dispDate
	
	@GET
	@Path("/dispDate")
	public Response restDateDisply() {

        // Connect to Buisness Layer.. DAO Layer... Based on the requirement and return the data
        // to the Consumer

        Date date = Calendar.getInstance().getTime();
        String today = date.toString();
		String message = "Welcome to Restfull web Services..  Please display date. Today is . " + today;
		return Response.status(200).entity(message).build();
	}

}
