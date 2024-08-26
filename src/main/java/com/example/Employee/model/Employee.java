package com.example.Employee.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @Column(name = "emp_id")
    int employeeID;
    @Column(name = "emp_name")
    String employeeName;
    @Column(name = "emp_add")
    String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "org_id", referencedColumnName = "org_id")
    @JsonManagedReference
    private Organisation organisation;

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }
}
