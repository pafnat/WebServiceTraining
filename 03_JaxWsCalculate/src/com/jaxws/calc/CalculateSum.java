package com.jaxws.calc;

import javax.jws.WebService;
import java.util.Date;

@WebService
public class CalculateSum {

    public int add (int x, int y) {
        return  x+y;
    }

    public int calProduct(int x, int y) {
        return x*y;
    }

    public String bookTicket(int crdCardNo, String pinNu, Date bookingDate, String movieName) {

/*
        boolean auth = PaymentGateway(int crdCardNo, String pinNu, Date bookingDate, String movieName);
        if (auth) {
            String msg = "Ticket Booked Successfully";
        }
*/

        // call to DAO layer Mathods...
        String msg = "Ticket Booked Successfully";
        return msg;
    }

}
