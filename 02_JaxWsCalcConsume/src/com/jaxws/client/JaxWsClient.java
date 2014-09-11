package com.jaxws.client;


import com.jaxws.calc.CalculateSum;
import com.jaxws.calc.CalculateSumService;

public class JaxWsClient {

    public static void main(String[] args) {

        CalculateSumService calculateSumService = new CalculateSumService();

        CalculateSum calcSum = calculateSumService.getCalculateSumPort();

        int sum = calcSum.add(11, 22);
        System.out.println("Sum="+sum);

        int prdt = calcSum.calProduct(11, 13);
        System.out.println("Product=" + prdt);

        //System.out.println(calcSum.bookTicket(1, "x", "01-01-2008", "XYZ"));

    }

}
