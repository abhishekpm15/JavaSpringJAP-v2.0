package com.example.Employee.controller;

import com.example.Employee.model.Employee;
import com.example.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return service.getAllEmployee();
    }

    @GetMapping("/getAllEmployeeById/{employeeID}")
    public Employee getAllEmployeeById(@PathVariable int employeeID){
        return service.getAllEmployeeById(employeeID);
    }

    @GetMapping("/getEmployeesByOrganisationID/{organisationID}")
    public List<Employee> getEmployeesByOrganisationID(@PathVariable int organisationID){
        return service.getEmployeesByOrganisationID(organisationID);
    }

}
