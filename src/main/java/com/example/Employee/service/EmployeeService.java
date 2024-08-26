package com.example.Employee.service;

import com.example.Employee.model.Employee;
import com.example.Employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }

    public Employee getAllEmployeeById(int employeeID){
        return employeeRepo.findById(employeeID).orElse(null);
    }

    public List<Employee> getEmployeesByOrganisationID(int organisationID) {
        return employeeRepo.findByOrganisationOrganisationID(organisationID);
    }
}
