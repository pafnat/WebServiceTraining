package com.spring.jaxrs;

import com.spring.jaxrs.model.Employee;
import com.spring.jaxrs.service.Employees;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

import java.util.ArrayList;


// http://localhost:8080/SpringRestEx/employees

// http://localhost:8080/SpringRestEx/employees/allemp
// http://localhost:8080/SpringRestEx/employees/test

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    // list of employees

    @RequestMapping(method= RequestMethod.GET, headers = "Accept=*/*", value = "allemp")
    public @ResponseBody Employees getAllEmployees() {

        //ContentNegotiatingViewResolver

        Employee emp1 = new Employee();
        emp1.setFirstName("firstName1");
        emp1.setLastName("lastName1");

        Employee emp2 = new Employee();
        emp2.setFirstName("firstName2");
        emp2.setLastName("lastName2");

        Employee emp3 = new Employee();
        emp3.setFirstName("firstName3");
        emp3.setLastName("lastName3");

        Employee emp4 = new Employee();
        emp4.setFirstName("firstName4");
        emp4.setLastName("lastName4");

        Employee emp5 = new Employee();
        emp5.setFirstName("firstName5");
        emp5.setLastName("lastName5");

        Employee emp6 = new Employee();
        emp6.setFirstName("firstName6");
        emp6.setLastName("lastName6");

        Employees employees = new Employees();
        employees.setEmployees(new ArrayList<Employee>());
        employees.getEmployees().add(emp1);
        employees.getEmployees().add(emp2);
        employees.getEmployees().add(emp3);
        employees.getEmployees().add(emp4);
        employees.getEmployees().add(emp5);
        employees.getEmployees().add(emp6);

        return employees;


    };

    @RequestMapping(method= RequestMethod.GET, headers = "Accept=*/*", value = "test")
    public @ResponseBody Employees getAllEmployee() {

        //ContentNegotiatingViewResolver

        Employee emp1 = new Employee();
        emp1.setFirstName("firstName1");
        emp1.setLastName("lastName1");

        Employee emp2 = new Employee();
        emp2.setFirstName("firstName2");
        emp2.setLastName("lastName2");

        Employee emp3 = new Employee();
        emp3.setFirstName("firstName3");
        emp3.setLastName("lastName3");

        Employees employees = new Employees();
        employees.setEmployees(new ArrayList<Employee>());
        employees.getEmployees().add(emp1);
        employees.getEmployees().add(emp2);
        employees.getEmployees().add(emp3);

        return employees;


    };


}
