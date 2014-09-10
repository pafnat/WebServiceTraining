package com.jaxws.calc;

import javax.jws.WebService;

@WebService
public class CalculateSum {

    public int add (int x, int y) {
        return  x+y;
    }

}
