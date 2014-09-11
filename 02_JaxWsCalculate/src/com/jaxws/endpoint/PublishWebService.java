package com.jaxws.endpoint;


import com.jaxws.calc.CalculateSum;

import javax.xml.ws.Endpoint;

public class PublishWebService {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/JaxWsCalculate/CalculateSum", new CalculateSum());





    }


}
