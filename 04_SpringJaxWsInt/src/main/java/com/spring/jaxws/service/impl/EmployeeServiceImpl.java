package com.spring.jaxws.service.impl;

import com.spring.jaxws.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    public String getJaxwsSpring() {

        // I can call the DAO layer
        return "This is Integration of Spring with JAX WS";

    }

}
