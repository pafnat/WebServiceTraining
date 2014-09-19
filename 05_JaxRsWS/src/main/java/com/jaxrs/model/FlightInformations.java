package com.jaxrs.model;


public class FlightInformations {

    private int flightid;
    private String flightname;
    private int seatsAvailable;
    private String source;
    private String dest;

    public FlightInformations(int flightid, String flightname, int seatsAvailable, String source, String dest) {
        super();
        this.flightid = flightid;
        this.flightname = flightname;
        this.seatsAvailable = seatsAvailable;
        this.source = source;
        this.dest = dest;
    }

    public int getFlightid() {
        return flightid;
    }

    public void setFlightid(int flightid) {
        this.flightid = flightid;
    }

    public String getFlightname() {
        return flightname;
    }

    public void setFlightname(String flightname) {
        this.flightname = flightname;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}
