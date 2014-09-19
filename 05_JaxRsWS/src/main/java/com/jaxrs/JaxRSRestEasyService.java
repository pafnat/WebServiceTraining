package com.jaxrs;

import com.jaxrs.model.FlightInformations;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.Calendar;
import java.util.Date;

// for messages we will have this url
// http://localhost:8080/JaxRsWS/rest/restwsex/

@Path("/restwsex")
public class JaxRSRestEasyService {

	
	//http://localhost:8080/JaxRsWS/rest/restwsex/message

    public JaxRSRestEasyService() {
        System.out.println("We are in JaxRSRestEasyService Constructor...");
    }
		
	@GET
	@Path("/message")
	public Response restMessageDisply() {
		String message = "Welcome to Restfull web Services..";

        //And You need to try the data from other classes/alyers/ May  be create a JDBC /Hibernate connection to the DB and pull data from database and send back to the consumer

        //FlightInformations finfo = new FlightInformations(1, "XYZ Flight Services...");

        // Other Layer Business Logic Implementations...

        return Response.status(200).entity(message).build();  // returning in other media formats....
	}

	
	//http://localhost:8080/JaxRsWS/rest/restwsex/dispDate
	
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

    @GET
    @Path("/flightInfo/{flightName}")
    // specify format (text, by default)
    // xml on below format will gnerate producer for delivering to Consumer
        /*
            <flightInfo>
            <flight1>
            <flightNo>FL0987</flightNo>
            <flightName><XYZ/flightName>
            <flightTime>14:30</flightTime>
            <flightSource>SRC</flightSource>
            <flightDest>DEST</flightDest>
            </flight1>
            ...
            </flightInfo>
        */
    // in case of xml, we have to prepare xml structure.
    // could be also json, we need additional dependency in pom.xml for this.
    @Produces("application/json")
    //public  Response flightInfoBooking(@PathParam("flightName") String flName) {
    public  FlightInformations flightInfoBooking(@PathParam("flightName") String flName) {

        System.out.println("JSON Media Type");
        FlightInformations flinfo = new FlightInformations(123, flName, 10, "Source City", "Destination City");
        //String flightInfoDesired = flName;
        // In order to Connect to Database I need Source, Dst, From, DateOFTravel, PriceRange

        //return Response.status(200).entity(flightInfoDesired).build();

        return flinfo;

    }


    public Response consumeJSON(FlightInformations flightInfo) {
        String output = flightInfo.toString();
        return Response.status(200).entity(output).build();
    }
}
